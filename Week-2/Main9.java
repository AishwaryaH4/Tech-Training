public class Main9 {
    public static void main(String[] argd){
        String s = "Java is easy";
        int count = 1;
        int idx = s.indexOf(' ');

        while (idx !=-1) { 
            count++;
            idx = s.indexOf(' ', idx + 1); // search next space
        }

        System.out.println(count);

    }
    
}


// public class Main9 {
//     public static void main(String[] args) {
//         String s = "Java is easy";
//         int count = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }

