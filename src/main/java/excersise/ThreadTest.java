package excersise;

public class ThreadTest implements Runnable {
    int x, y;
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){

            synchronized (this){
                int count = 0;
                x=12;
                y=12;
                count++;
                System.out.println(x +" " + y + " " + count);
            }


        }
    }

    public static void main(String[] args) {
        ThreadTest run = new ThreadTest();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }
}
