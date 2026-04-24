public class Main10 {
    public static void main(String[] args){
        String s="Banana";
        char target='a';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
