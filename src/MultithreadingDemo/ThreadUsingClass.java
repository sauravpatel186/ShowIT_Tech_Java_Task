package MultithreadingDemo;

public class ThreadUsingClass extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        ThreadUsingClass th = new ThreadUsingClass();
        th.start();
    }
}
