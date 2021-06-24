package code.java.other.threadtest;

public class MyThread2 implements Runnable{

    public static void main(String[] args) throws InterruptedException{

        MyThread2 myThread = new MyThread2();
        myThread.run();

        Thread thread = new Thread("newThread");
        Thread.sleep(3000);
        thread.start();

        System.out.println(Thread.currentThread().getName() + " is alive?" + thread.isAlive());

    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}
