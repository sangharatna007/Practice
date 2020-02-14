package thread;

public class TestThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Who is in" + currentThread());
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setName("First One");
        thread.start();

        Thread thread2 = new Thread();
        thread2.setName("second Thread");
        thread2.start();


        TestThreadClass threadClass = new TestThreadClass();
        threadClass.setName("Class thread");
        threadClass.start();


    }
}
