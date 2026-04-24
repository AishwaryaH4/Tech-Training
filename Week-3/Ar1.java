public class Ar1{
    public static void main(String[] args){
        int a[]={1,5,3,2};
        int n=a.length;
        int res=0;
        
        for (int k=0;k<n;k++){
            for (int i=0;i<n;i++ ){
                for(int j=i+1;j<n;j++){
                    if(a[i]+a[j]==a[k] && i != k && j != k){
                        res=res+1;
                    }
                }
            }
        }
        System.out.println(res);
    }
}