package MultithreadingDemo;

public class BankAccount{
    static double balance = 1000;
    public synchronized  void withDraw(double amount){
            if(balance >=amount){
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance = balance - amount;
                System.out.println("Remaining balance: " + balance);
            }
            else{
                System.out.println("Not sufficent balance");
            }
    }

}
