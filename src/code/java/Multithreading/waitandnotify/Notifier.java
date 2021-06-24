package code.java.Multithreading.waitandnotify;

public class Notifier implements Runnable{

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started");

        try {
            Thread.sleep(2000);

             /*synchronized block marks a method or a block of code as synchronized.
             A synchronized block in Java can only be executed a single thread at a time*/
            synchronized (message) {
                message.notify();
                System.out.println(threadName + " notified successfully");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
