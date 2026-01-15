package MultithreadingDemo;

public class TicketBooking {
    public static void main(String[] args) throws InterruptedException {
        TicketBooker booker = new TicketBooker();
        Runnable r1 = ()->booker.booking(2);
        Runnable r2 = ()->booker.booking(1);
        Runnable r3 = ()->booker.booking(3);

        Thread t1 = new Thread(r1,"Kaushal");
        t1.start();
        t1.join();

        Thread t2 = new Thread(r2,"Saurav");
        t2.start();
        t2.join();

        Thread t3 = new Thread(r3,"Kalp");
        t3.start();
        t3.join();
    }
}
