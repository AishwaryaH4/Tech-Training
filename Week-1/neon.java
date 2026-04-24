public class neon {
    public static void main(String[] args){
        int n=9;
        int square=n*n;
        int temp=square;
        int sum=0;

        while(temp>0){
            int digit=temp%10;
            temp=temp/10;
            sum=sum+digit*digit;
            

        }
        temp=sum;
        if(temp==n){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not Neon Number");
        }

    }
    
}
