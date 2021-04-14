
package Z;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Wyknawcy2 {
    public static void main(String[] args)throws InterruptedException {
       ExecutorService executor = Executors.newSingleThreadExecutor();

      try {
         executor.submit(new Fibonacci());
         System.out.println("Shutdown executor");
         executor.shutdown();
         executor.awaitTermination(5, TimeUnit.SECONDS);
      } catch (InterruptedException e) {
         System.err.println("tasks interrupted");
      } finally {

         if (!executor.isTerminated()) {
            System.err.println("cancel non-finished tasks");
         }
         executor.shutdownNow();
         System.out.println("shutdown finished");
      }
   }

    }


