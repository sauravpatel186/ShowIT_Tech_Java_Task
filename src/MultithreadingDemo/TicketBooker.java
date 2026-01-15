package MultithreadingDemo;

import java.util.Random;

public class TicketBooker {
    static int tickets = 5;
    public synchronized void booking(int quantity){
        System.out.println(Thread.currentThread().getName());
        if(tickets>quantity){

            tickets = tickets - quantity;

            System.out.println("Thank you for purchasing ticket");
            for(int i=1;i<=quantity;i++){

                System.out.println("Your Ticket Number is"+generateTicketNumber());
            }

        } else if (tickets<quantity) {

            System.out.printf("Sorry %d tickets not available ",quantity);

        } else{
            System.out.println("Sorry, all the tickets sold out");
        }

    }
    public int generateTicketNumber(){
        return new Random().nextInt(9000) + 1000;
    }
}
