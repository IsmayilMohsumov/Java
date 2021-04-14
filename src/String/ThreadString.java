/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

class Counter {
// StringBuffer count = new StringBuffer();

    StringBuilder count1 = new StringBuilder();

    public synchronized void increment() {
//     count.append("i");
        count1.append("i");

    }
}

public class ThreadString {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        System.out.println(c.count.length());
        System.out.println(c.count1.length());
    }

}
