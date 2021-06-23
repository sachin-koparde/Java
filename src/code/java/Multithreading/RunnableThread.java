package code.java.Multithreading;

public class RunnableThread implements Runnable {

    private Thread thread;

    private String threadName;

    public RunnableThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        System.out.println("Thread running: " + threadName);

        for (int index = 0; index < 5; index++) {
            System.out.println(index);

            try {
                thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
    }

    public void start() {
        System.out.println("Thread is started: " +threadName);

        if(thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
