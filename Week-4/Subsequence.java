
// Double recursion
  
public class Subsequence {
    static void subseq(String input, String current, int index) {   // input "abc"
        if (index == input.length()) {
            System.out.println(current);
            return;
        }

        // Choice 1: Include the character at the current index
        subseq(input, current + input.charAt(index), index + 1);

        // Choice 2: Exclude the character at the current index
        subseq(input, current, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subseq(str, "", 0);
    }
}
