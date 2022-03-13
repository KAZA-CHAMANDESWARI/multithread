import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadPool implements Runnable
{
    public void run()
    {
      System.out.println("Thread created:"+Thread.currentThread().getName());  
    }
}
public class FixedThreadPool
{
    public static void main(String args[])
    {
        Runnable r1 =new ThreadPool();
        Runnable r2 =new ThreadPool();
        Runnable r3 =new ThreadPool();
        Runnable r4 =new ThreadPool();
        Runnable r5 =new ThreadPool();
        Runnable r6 =new ThreadPool();
        Runnable r7 =new ThreadPool();
        Runnable r8 =new ThreadPool();
        Runnable r9 =new ThreadPool();
        Runnable r10 =new ThreadPool();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);
        executor.submit(r6);
        executor.submit(r7);
        executor.submit(r8); 
        executor.submit(r9);
        executor.submit(r10);
    }
}