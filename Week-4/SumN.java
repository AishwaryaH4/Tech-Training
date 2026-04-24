// Sum of n numbers using recursion

public class SumN {
    public int sum(int n){
        if(n==0) return 0;
        return n + sum(n-1);
    }

    public static void main(String[] args){
        SumN s=new SumN();
        System.out.println(s.sum(5));
    }
    
}
