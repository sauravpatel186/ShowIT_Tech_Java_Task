package MultithreadingDemo;

public class Account{
    public static void main(String[] args) throws InterruptedException {
      BankAccount acc = new BankAccount();
      Runnable r1  = ()->acc.withDraw(100);
      Runnable r2  = ()->acc.withDraw(200);
        Thread t1= new Thread(r1,"Thread 1");
        Thread t2= new Thread(r2,"Thread 2");
        t1.start();
        t2.start();
    }
}
