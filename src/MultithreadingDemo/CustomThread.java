package MultithreadingDemo;

class  Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class CustomThread {
    public static void main(String[] args) {
        Thread1 th = new Thread1();
        th.setName("Thread 1");
        Thread1 th2 = new Thread1();
        th2.setName("Thread 2");
        Thread1 th3 = new Thread1();
        th3.setName("Thread 3");
        th.start();
        th2.start();
        th3.start();

    }
}
