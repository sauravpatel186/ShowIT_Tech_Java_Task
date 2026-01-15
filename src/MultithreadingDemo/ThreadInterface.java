package MultithreadingDemo;

public class ThreadInterface implements  Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){

        ThreadInterface th = new ThreadInterface();
        Thread t = new Thread(th);
        t.start();
    }
}
