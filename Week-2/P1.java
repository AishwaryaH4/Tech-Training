import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        System.out.println("Enter the input string:");
        String in=sc.nextLine();

        sb.append("Java");
        System.out.println("Append : "+sb);

        sb.insert(1,"is");
        System.out.println("Insert : "+sb);

        sb.reverse();
        System.out.println("Reverse : "+sb);

        sb.replace(0,5,"Programming");
        System.out.println("Replace : "+sb);

        sb.delete(5,8);
        System.out.println("Delete : "+sb);

        System.out.println("Length : "+sb.length());

        sb.capacity();
        System.out.println("Capacity : "+sb);

        if(sb.length()>2)
            System.out.println("charAt : "+sb.charAt(2));

        if(sb.length()>0)
            sb.setCharAt(0,'P');
            System.out.println("setCharAt : "+sb);


        sc.close();
    }
    
}
