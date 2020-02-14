package excersise;

public class ThreadTest2 {
    private int count =1;
    public synchronized void doSomething(){
        for(int i =0; i <10; i++)
        {
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
        ThreadTest2 demo = new ThreadTest2();
        Thread t1 = new ExampleThread(demo);
        Thread t2 = new ExampleThread(demo);
        t1.start();
        t2.start();
    }


}
class ExampleThread extends Thread {
    ThreadTest2 demo2;
    public ExampleThread(ThreadTest2 td) {
        demo2 = td;
    }

    @Override
    public void run() {
        demo2.doSomething();
    }
}
