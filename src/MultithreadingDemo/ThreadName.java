package MultithreadingDemo;

public class ThreadName extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Saurav");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args){
        ThreadName th = new ThreadName();
        th.start();
    }
}
