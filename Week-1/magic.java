public class magic {
    public static void main(String[] args){
        int n=1;
        int sum=n;
        if(n<9){
            System.out.println("Not Magic Number");
        }else{
        while(sum>9){
            int temp=sum;
            sum=0;
            while(temp>0){
                sum=sum+temp%10;
                temp=temp/10;
            }
        }

        if(sum==1){
            System.out.println("Magic Number");
        }else{
            System.out.println("Not Magic Number");
        }
    }
        
    }
    
}
