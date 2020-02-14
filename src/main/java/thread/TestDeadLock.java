package thread;

public class TestDeadLock {
    public static void main(String[] args) {
        String resource = "Test resource 1";
        String resource2 = "Test resource 2";
        Thread thread = new Thread(){
          public void run(){
              synchronized (resource)
              {
                  System.out.println("Thread 1 : lock resource 1");
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              synchronized (resource2)
              {
                  System.out.println("Thread 2 : lock resource 2");
              }
              }

          }
        };
        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        thread.start();
        t2.start();
    }
}
