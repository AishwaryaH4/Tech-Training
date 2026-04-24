public class SubarraySumSimple {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 7, 5};
        int n = a.length;
        int S = 12;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+a[j];
                if(sum==S){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }

    }
}