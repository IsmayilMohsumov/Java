
package Z2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Results {

    public static void main(String[] args) throws IOException {
        ExecutorService exec = Executors.newCachedThreadPool();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i=0; i<3;i++){
            System.out.println("Enter a name for the thread "+i+" :");
            results.add(exec.submit(new Zadanie(i,br.readLine()))); 
        }
        
        for (Future<String> fs : results)
            try {
                //Tak odbieramy wynik z wątku - metoda get() blokuje wywołującego!
                System.out.println(fs.get());
              
//                if(fs.isDone())System.out.println("done");
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
                return;
            }
            catch (ExecutionException e)
            {
                System.out.println(e);
            }
            finally {
                exec.shutdown();
            }
    }
    
}

/* Zadanie: napisać program, który stworzy tyle wątków, ile jest argumentów
wywołania programu (każdy wątek dostanie osobny argument).
Wątek ma policzyć liczbę znaków w tym argumencie oraz wyświetlić na ekranie 
własny identyfikator, parametr oraz liczbę znaków w nim.

*/