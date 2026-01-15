package MultithreadingDemo;

class UserThread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++){

                System.out.println("User thread");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class DaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Deomen Thread Running");
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class MyDaemonThread {
    public static void main(String[] args) {
        UserThread user = new UserThread();
        DaemonThread daemonThread = new DaemonThread();

        daemonThread.setDaemon(true);
        daemonThread.start();
        user.start();
    }
}
