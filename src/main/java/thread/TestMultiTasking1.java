package thread;

public class TestMultiTasking1 extends Thread {

    @Override
    public void run() {
        System.out.println("Task one :" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestMultiTasking1 task1 = new TestMultiTasking1();
        TestMultiTasking1 task2 = new TestMultiTasking1();
        TestMultiTasking1 task3 = new TestMultiTasking1();

        task1.start();
        task2.start();
        task3.start();

    }

}
