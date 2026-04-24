final class A {                  // final class
    final int x = 10;            // final variable
    final void show() {          // final method
        System.out.println(x);
    }
}

public class FinalExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
