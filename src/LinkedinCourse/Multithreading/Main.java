package LinkedinCourse.Multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadExampleByThreadClass t1 = new ThreadExampleByThreadClass();
        t1.setName("MyFirstThread");
        ThreadExampleByThreadClass t2 = new ThreadExampleByThreadClass();
        t2.setName("MySecondThread");
        t1.start();
        t2.start();

        System.out.println("");///////////////////////////////////////BY RUNNABLE

        Thread thread1 = new Thread(new ThreadExampleByRunnable());
        Thread thread2 = new Thread(() -> {
            int i = 1;
            while (i <= 10) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i += 1;
            }
        });
        System.err.println("Wait a minute...");
        Thread.sleep(5000);

        
        
        thread1.start();
        thread2.start();
        System.out.println(Thread.activeCount());

    }
}
