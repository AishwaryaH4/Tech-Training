import java.util.Scanner;

public class calci {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        
            return a / b;
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            int op = sc.nextInt();

            if (op == 5) {
                running = false;
                break;
            }

            System.out.print("Enter first number: ");
            int a = sc.nextInt();
           System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Result = " + add(a, b));
                    break;
                case 2:
                    System.out.println("Result = " + sub(a, b));
                    break;
                case 3:
                    System.out.println("Result = " + mul(a, b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result = " + div(a, b));
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            System.out.println();
        }

        sc.close();
    }
}
