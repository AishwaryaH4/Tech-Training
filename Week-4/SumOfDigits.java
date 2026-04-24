
// Recursion 

public class SumOfDigits {

    public int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }

    public static void main(String[] args){

        SumOfDigits s = new SumOfDigits();
        System.out.println(s.sum(123));        // 1+2+3 = 6
        
    }
}
