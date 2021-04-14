package Z2;

import java.util.concurrent.Callable;


public class Zadanie implements Callable<String> {
    private final int id;
    private final String name;
    
    public Zadanie(int id,String threadName)
    {
        this.id = id;
        this.name=threadName;
    }
    @Override
    public String call() throws InterruptedException
    {
        Thread.sleep(1000);
        return "Wynik wywołania Zadania: " + id+" " + name + "\n"+ informacja(name);
    }
    public String informacja(String line) {
        String name =line.replaceAll("\\s+", "");
          
        return "Total number of characters = " + name.length(); 
    }
    
}
