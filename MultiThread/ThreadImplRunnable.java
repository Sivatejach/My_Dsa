package MultiThread;

public class ThreadImplRunnable {
    public static void main(String[] args) {
        // Create a new thread using the Runnable interface
        Thread thread1 = new Thread(() -> {
                System.out.println("Thread is running");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(" - Count: " + i);
                    try {
                        Thread.sleep(1000);  // Simulating delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread has finished running.");
        });
        thread1.start();  // Start the thread
        Thread thread2 = new Thread(() -> {
        System.out.println("Thread is running");
            for (int i = 1; i <= 5; i++) {
                System.out.println(" - Count: " + i);
                try {
                    Thread.sleep(1000);  // Simulating delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println("Thread has finished running.");
        });
        thread2.start();  // Start the thread
    }
}
