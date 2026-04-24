public class JumpSearch {
    public static void main(String[] args){
        int a[]={3,6,9,12,15};
        int n=a.length;
        int key=12;
        int step=(int)Math.sqrt(n);
        int prev=0;
        
        while(a[Math.min(step,n)-1]<key){
            prev = step;
            step = step + (int)Math.sqrt(n);
        }

        for(int i=prev;i<Math.min(step,n);i++){
            if(a[i]==key){
                System.out.println("Element found at index : "+i);
                break;
            }
        }


    }
    
}
