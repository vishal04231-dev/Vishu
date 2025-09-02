class SharedResource extends Thread {
    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started running...");
        while (running) {
           
        }
        System.out.println("Thread stopped.");
    }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource thread = new SharedResource();
        thread.start();

        Thread.sleep(2000); 

        thread.running = false; 
        System.out.println("Main thread changed running to false.");
    }
}
