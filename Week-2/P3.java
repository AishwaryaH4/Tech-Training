class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Sleeping...");
            Thread.sleep(5000); // sleep for 5 seconds
            System.out.println("Awake!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class P3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
