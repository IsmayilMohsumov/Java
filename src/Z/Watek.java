/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z;

/**
 *
 * @author pbils
 */
public class Watek implements Runnable {

    //Tu są współdzielone zmienne - dla każdego wątku będzie doliczanie od 10 do 0
    protected int odliczanie = 10;
    private static int aktualny = 0;
    private final int id = aktualny++;
    //Konstruktor domyślny
    public Watek()
    {

    }
    //Konstruktor, w którym dostajemy nową wartość do odliczenia
    public Watek(int liczbaWatkow)
    {
        this.odliczanie = odliczanie;
    }
    //Metoda zwraca napis - albo ile zostało do końca odliczania, albo że już startujemy
    public String status()
    {
        return " Watek " + id + ":" + 
                (odliczanie > 0 ? odliczanie : " ruszamy!\n");
    }
    
    //Główna metoda wątku, wykonujemy wielokrotnie odliczanie aż do zera dla każdego wątku
    @Override
    public void run() {
        while (odliczanie-- > 0)
        { 
            System.out.print(status());
            Thread.yield();
        }
        
    }
}