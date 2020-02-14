package thread;

public class ThreadGroupDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo demo = new ThreadGroupDemo();
        ThreadGroup grp1 = new ThreadGroup("Master Group");

        Thread thread = new Thread(grp1, demo, "thread");
        thread.start();

        Thread thread1 = new Thread(grp1, demo, "thread1");
        thread1.start();

        Thread thread2 = new Thread(grp1, demo, "thread2");
        thread2.start();

        System.out.println("Thread Group Name" + grp1.getName());
        grp1.list();
    }
}
