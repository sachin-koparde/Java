package code.java.other.threadtest;

public class MyThread extends Thread{

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("Run method started");
    }
}
