package MultithreadingDemo;

public class PrintNumber extends Thread{
    private int start;
    private int end;
    public PrintNumber(int start,int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        for(int i = start; i<=end;i++){

            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args){
        PrintNumber p1 = new PrintNumber(1,10);
        PrintNumber p2 = new PrintNumber(11,20);
        p1.setName("Thread 1");
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.setPriority(Thread.MIN_PRIORITY);
        p2.setName("Thread 1");
        p2.start();

    }
}
