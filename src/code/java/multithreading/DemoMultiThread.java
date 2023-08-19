package code.java.multithreading;

public class DemoMultiThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello"); //printing hello here
    }

    public static void main(String[] args) throws InterruptedException {

        //creating a new Thread with name newThread
        Thread newThread = new Thread(new DemoMultiThread());

        newThread.start(); //thread will start its execution here

        //sleep(int milli-seconds)
        newThread.sleep(2000); //thread will sleep for 2000 milli-seconds

        newThread.setPriority(1); //setting a priority

        System.out.println(newThread.getPriority());

        System.out.println("Thread is running.");

        newThread.interrupt();

    }

}
