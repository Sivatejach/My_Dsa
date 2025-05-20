package MultiThread;

public class SynchThread  {
    // Synchronized Method
    public synchronized void doRun() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println( " - Count: " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( "Thread has finished running.");
    }

    public static void main(String[] args) {
        SynchThread syncht = new SynchThread();

        // Create threads using Runnable and call the synchronized method
        Thread t1 = new Thread(() ->{
            syncht.doRun();
        });
        Thread t2 = new Thread(() ->{
            syncht.doRun();
        });
        t1.start();  // Starts a new thread
       
        t2.start();  // Starts another thread
    }
}