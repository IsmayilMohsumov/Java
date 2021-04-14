 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z2;

/**
 *
 * @author Paris
 */
public class Zadania implements Runnable {

    private Thread thread;

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public static void main(String[] args) {
        long certainWaitingTime = 1000 * 60 * 60;
        Zadania task1 = new Zadania();
        Zadania task2 = new Zadania();
        Thread t1 = new Thread(task1, "Thread - 1");
        Thread t2 = new Thread(task2, "Thread - 2");

        task1.setThread(t1);
        task1.setThread(t2);

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        if (thread != null) {
            try {
                thread.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Finished");
        }

    }

}
