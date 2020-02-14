package thread;

public class MultiTasking3 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread 1");
            }
        };

        Thread thread2 = new Thread(){
            public void run(){
                System.out.println("Thread 2");
            }
        };

        thread.start();
        thread2.start();
    }
}
