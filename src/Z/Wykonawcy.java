/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z;

import java.util.concurrent.*;

/**
 *
 * @author pbils
 */
public class Wykonawcy {

    public static void main(String[] args) {
        //Wykorzystujemy klasę do przetwarzania współbieżneg ow celu poprzez 
        //asnychorniczne zarządzanie obiektami klasy Thread
        ExecutorService wykonawca = Executors.newFixedThreadPool(2);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) wykonawca;
        System.out.println("Largest executions: "
                + pool.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "
                + pool.getMaximumPoolSize());
        System.out.println("Current threads in pool: "
                + pool.getPoolSize());
        System.out.println("Currently executing threads: "
                + pool.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): "
                + pool.getTaskCount());
        //Odpalamy kolejno wątki
        
        wykonawca.submit(new Watek());
        System.out.println("    ");
        
         System.out.println("Core threads: " + pool.getCorePoolSize());
      System.out.println("Largest executions: "
         + pool.getLargestPoolSize());
      System.out.println("Maximum allowed threads: "
         + pool.getMaximumPoolSize());
      System.out.println("Current threads in pool: "
         + pool.getPoolSize());
      System.out.println("Currently executing threads: "
         + pool.getActiveCount());
      System.out.println("Total number of threads(ever scheduled): "
         + pool.getTaskCount());
        
        for (int i = 0; i < 10; i++) {
            wykonawca.execute(new Watek());
        }
        //Kończymy i zwalniamy zasoby
        wykonawca.shutdown();
    }

}

/*
 Zadanie 1: Zmodyfikować kod tak, aby wykorzystać do tego samego celu pulę wątków
 newFixedThreadPool z ustaloną liczbą wątków
 Zadanie 2: Zmodyfikować kod tak, aby wykorzystać do tego samego celu wykonawcę
 newSingleThreadExecutor - jaki będzie efekt?
 Zadanie 3: ZModyfikuj klsę Wątek tak, aby w każdym wątku generować określoną 
 liczbę wyrazow ciągu Fibonacciego
 */
