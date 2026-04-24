public class Ar6 {
    public static void main(String[] args){
        int a[]={1,2,3,-2,5};    // int a[]={-1,-2,-3,-4,-5};  // -1
        int n=a.length;
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(sum<0){
                sum=a[i];
            }else{
                sum=sum+a[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);  // 9
    }
}
