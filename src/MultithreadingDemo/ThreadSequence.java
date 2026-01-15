package MultithreadingDemo;

public class ThreadSequence extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
           ThreadSequence t = new ThreadSequence();
           t.setName("A");
           t.start();
           t.join();

           ThreadSequence t1 = new ThreadSequence();
           t1.setName("B");
           t1.start();
           t1.join();

            ThreadSequence t2 = new ThreadSequence();
            t2.setName("C");
            t2.start();
            t2.join();
    }
}
