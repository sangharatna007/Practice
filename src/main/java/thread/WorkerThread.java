package thread;

public class WorkerThread implements Runnable {
    private String message;
    WorkerThread(String string){
        this.message = string;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "(Start) Message" + message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+"End");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
