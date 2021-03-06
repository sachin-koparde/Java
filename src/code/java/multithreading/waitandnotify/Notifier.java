package code.java.multithreading.waitandnotify;

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
            Thread.sleep(1000);

             /*synchronized block marks a method or a block of code as synchronized.
             A synchronized block in Java can only be executed a single thread at a time*/
            synchronized (message) {
                message.setMessage(threadName + " notifier work done");
//                message.notify();
                message.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
