public class Josephuss {

    static int jos(int n, int k) {
        if (n == 1) return 0;              // 0-based index
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 7, k = 3;
        System.out.println(jos(n, k) + 1); // +1 for 1-based person number
    }
}
