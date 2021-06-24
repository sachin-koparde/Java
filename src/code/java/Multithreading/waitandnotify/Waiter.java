package code.java.Multithreading.waitandnotify;

public class Waiter implements Runnable{

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        synchronized (threadName) {

            try {
                //this will wait for other threads to invoke notify method to complete its process(es)
                message.wait();
                System.out.println("Waiting to get notified at time " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //once notified, following message will be printed
            System.out.println(threadName + " waiter got notified at " + System.currentTimeMillis());

            System.out.println(threadName + " processed: " + message.getMessage());
        }

    }
}
