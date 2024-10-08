
class AscendingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ascending: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Exiting Ascending Thread");
    }
}

class FibonacciThread extends Thread {
    public void run() {
        int a = 0, b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fibonacci: " + a);
            int temp = a;
            a = b;
            b = temp + b;
            try {
                Thread.sleep(2000); // sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Exiting Fibonacci Thread");
    }
}

class MultithreadTest {
    public static void main(String[] args) {
        AscendingThread ascending = new AscendingThread();
        FibonacciThread fibonacci = new FibonacciThread();
        ascending.start();
        fibonacci.start();
    }
}
