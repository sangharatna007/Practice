package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; i++)
        {
            Runnable worker = new WorkerThread(""+ i);
            service.execute(worker);
        }
        service.shutdown();
        while (!service.isTerminated()){}
        System.out.println("All thread Execution completed");
    }
}
