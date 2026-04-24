public class Recursion {
    static boolean isEven(int n){
        if(n==0) return true;
        return isOdd(n-1);
    }

    static boolean isOdd(int n){
        if(n==0) return false;
        return isEven(n-1);
    }
    public static void main(String[] args){
        int n=5;
        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
