
// Finding maximum sum of sub array using SLIDING WINDOW

public class Ar7 {
    public static void main(String[] args){
        int a[]={3,8,2,5,7,6,12};
        int n=a.length;
        int w=4;              // size of the window
        int cur_sum=0;

        for(int i=0;i<w;i++){
            cur_sum=cur_sum+a[i];
        }
        System.out.println("Current Sum : "+cur_sum);

        int max_sum=cur_sum;
    
        for(int i=1;i<=n-w;i++){
            cur_sum=cur_sum-a[i-1]+a[i+w-1];
            if(cur_sum>max_sum){
                max_sum=cur_sum;
            }
        }
        System.out.println("Final Max Sum : "+max_sum);
    }
    
}
