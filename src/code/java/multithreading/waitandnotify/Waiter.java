package code.java.multithreading.waitandnotify;

public class Waiter implements Runnable{

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        /*synchronized block marks a method or a block of code as synchronized.
             A synchronized block in Java can only be executed a single thread at a time*/
        synchronized (message) {
            try {
                //this will wait for other threads to invoke notify method to complete its process(es)
                message.wait();
                System.out.println(threadName + " waiting to get notified at time " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //once notified, following message will be printed
            System.out.println(threadName + " waiter got notified at " + System.currentTimeMillis());

            System.out.println(threadName + " processed: " + message.getMessage());
        }

    }
}
