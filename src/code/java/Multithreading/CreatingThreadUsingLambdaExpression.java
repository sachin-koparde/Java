package code.java.Multithreading;

public class CreatingThreadUsingLambdaExpression implements Runnable{

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("This is Runnable"));

        thread.start();

        System.out.println("Thread is running.");

    }

    @Override
    public void run() {

    }
}
