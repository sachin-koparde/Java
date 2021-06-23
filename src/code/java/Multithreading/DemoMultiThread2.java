package code.java.Multithreading;

public class DemoMultiThread2 {

    public static void main(String[] args) {

        RunnableThread thread1 = new RunnableThread("THREAD1");
        thread1.start();

        RunnableThread thread2 = new RunnableThread("THREAD2");
        thread2.start();

    }

}
