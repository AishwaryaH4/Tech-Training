// Reverse of a number using recursion

public class Reverse {
    public int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
    
        System.out.println(r.reverse(1234, 0));
    }

}
