package MultiThread;


class MulThreadImpl extends Thread {
    public  void run() {
        for (int i = 1; i <= 20000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MulThreadImpl t1 = new MulThreadImpl();
        MulThreadImpl t2 = new MulThreadImpl();

        t1.start();
        t2.start();
    }
}
