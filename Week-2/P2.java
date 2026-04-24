
// Separate letters and numbers from a string

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String s = sc.nextLine();

        StringBuilder let = new StringBuilder();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                let.append(ch);
            } else if (Character.isDigit(ch)) {
                num.append(ch);
            }
        }

        // Store output in array
        String[] output = { let.toString(), num.toString() };
        System.out.println("[\"" + output[0] + "\",\"" + output[1] + "\"]");
        
        sc.close();
    }

    
}
