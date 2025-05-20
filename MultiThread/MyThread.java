package MultiThread;

    public class MyThread extends Thread  {
        @Override
        public void run() {
            System.out.println("Thread is running");
            try {
                Thread.sleep(5000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            System.out.println("Thread has finished running");
        }

        public static void main(String[] args) {
            MyThread thread = new MyThread();
            thread.start(); // Start the thread
        }    
    }
