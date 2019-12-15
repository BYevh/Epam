package ua.epam.javacore.hometask08.threethreadsinline;


import java.util.concurrent.CountDownLatch;

public class ThreeThreadsInLine {
    private volatile CountDownLatch lock1 = new CountDownLatch(1);
    private volatile CountDownLatch lock2 = new CountDownLatch(1);

    public static ThreeThreadsInLine instance;

    public static synchronized ThreeThreadsInLine getInstance() {
        if (instance == null) {
            instance = new ThreeThreadsInLine();
        }
        return instance;
    }


    public void first() throws InterruptedException {
        System.out.print("first");
        lock1.countDown();
    }

    public void second() throws InterruptedException {
        lock1.await();
        System.out.print("second");
        lock2.countDown();
    }

    public void third() throws InterruptedException {
        lock2.await();
        System.out.print("third");
    }


}