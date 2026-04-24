
// Second largest in an array

public class Ar8 {
    public static void main(String[] args){
        int a[]={10,10,10};           // int a[]={12,35,1,10,34,1};
        int n=a.length;
        int max=Integer.MIN_VALUE;    // int max=0;

        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max :"+max);

        int sec_max=Integer.MIN_VALUE;         // int sec_max=0;
        for(int i=0;i<n;i++){
            if(a[i]>sec_max && a[i]<max){
                sec_max=a[i];  
            }else{
                sec_max=-1;
            }
        }
        System.out.println("Second Max : "+sec_max);
    }
}
