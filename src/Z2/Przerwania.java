package Z2;

    public class Przerwania {

    static void writeMessage(String message) {
	// Pobieramy nazwę wątku:
        String nazwaWatku = Thread.currentThread().getName();
        System.out.format("%s: %s%n", nazwaWatku, message);
    }

    //Tu będzie klasa wewnętrzna
    private static class Petla implements Runnable {

        public void run() {
	    // Jakaś tablica napisów
            String importantInfo[] = {
                "Napis 1", "Napis 2", "Napis 3", "Napis 4"
            };
	    // Uwaga: to jest operacja krytyczna, stąd try-catch!!
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    // Czekamy 4 sekundy
                    Thread.sleep(4000);
                    // Piszemy na konsolę
                    writeMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
		//Tu przechwytujemy przerwanie z wątku głównego
                writeMessage("Nie skończyłem!");
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {

        // Opóźnienie zanim przerwiemy pętlę wypisującą napisy  (1h)
        long czekanie = 1000 * 60 * 60;

        // Jeśli został podany argument z wiersza poleceń
        // jest podawana liczba sekund oczekiwania
        if (args.length > 0) {
            try {
                czekanie = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument musi być liczba calkowita!");
                System.exit(1);
            }
        }

        writeMessage("Start the loop!");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new Petla());
        t.start();

        writeMessage("We are waiting for the loop to finish");
	//Dopóki wątek działa
        while (t.isAlive()) {
            writeMessage("Waiting...");
	    //Czekamy sekundę aż wątek wykonawczy zakończy działanie
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > czekanie)
                  && t.isAlive()) {
                writeMessage("Dość czekania!");
                t.interrupt();
		//Znowu czekamy, tym razem dowolną ilość czasu
                t.join();
            }
        }
        writeMessage("End!");
    }
}

/*
Zadanie: Stworzyć dwa wątki wykonawcze (mogą wypisywać napisy na ekranie), które będą wzajemnie na siebie czekać określoną ilość czasu, 
podaną dla każdego wątku osobno jako parametr wywołania programu
*/