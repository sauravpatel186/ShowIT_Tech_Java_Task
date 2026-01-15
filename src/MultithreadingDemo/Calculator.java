package MultithreadingDemo;

class Addition extends Thread{
    int a,b;
    Addition(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        System.out.println("Sum is" +(a+b));
    }
}
class EvenNumber extends Thread{
    int a;
    EvenNumber(int a){
        this.a = a;
    }
    @Override
    public void run() {
        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
class Tableof5 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<11;i++){
            System.out.printf("5 * %d = %d",i,(5*i));
            System.out.println("");
        }
    }
}
public class Calculator {
    public static void main(String[] args) throws InterruptedException {

        Addition add = new Addition(10,20);
        EvenNumber evenNumber = new EvenNumber(10);
        Tableof5 table = new Tableof5();
        add.start();
        add.join();
        evenNumber.start();
        evenNumber.join();
        table.start();
    }

}
