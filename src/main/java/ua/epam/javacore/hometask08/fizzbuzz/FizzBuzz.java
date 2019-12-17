package ua.epam.javacore.hometask08.fizzbuzz;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzz {
    private int bound;

    public static FizzBuzz instance;

    public static synchronized FizzBuzz getInstance() throws InterruptedException {
        if (instance == null) {
            instance = new FizzBuzz();
        }
        return instance;
    }

    private FizzBuzz() throws InterruptedException {
        fizz.acquire();
        buzz.acquire();
        fizzBuzz.acquire();
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    private AtomicInteger num = new AtomicInteger(1);

    private Semaphore fizz = new Semaphore(1);
    private Semaphore buzz = new Semaphore(1);
    private Semaphore fizzBuzz = new Semaphore(1);
    private Semaphore n = new Semaphore(1);

    public void fizz() throws InterruptedException {
        while (num.get() <= bound) {
            fizz.acquire();
            if (num.get() > bound) return;
            System.out.print("fizz ");
            ;
            num.incrementAndGet();
            release();
        }
        releaseAll();
    }

    public void buzz() throws InterruptedException {
        while (num.get() <= bound) {
            buzz.acquire();
            if (num.get() > bound) return;
            System.out.print("buzz ");
            num.incrementAndGet();
            release();
        }
        releaseAll();
    }

    public void fizzBuzz() throws InterruptedException {
        while (num.get() <= bound) {
            fizzBuzz.acquire();
            if (num.get() > bound) return;
            System.out.print("fizzbuzz ");
            num.incrementAndGet();
            release();
        }
        releaseAll();
    }

    public void number() throws InterruptedException {
        while (num.get() <= bound) {
            n.acquire();
            if (num.get() > bound) return;
            System.out.print(num + " ");
            num.incrementAndGet();
            release();
        }
        releaseAll();
    }

    public void release() {
        if (num.get() % 3 == 0 && num.get() % 5 == 0) {
            fizzBuzz.release();
        } else if (num.get() % 3 == 0) {
            fizz.release();
        } else if (num.get() % 5 == 0) {
            buzz.release();
        } else {
            n.release();
        }
    }

    private void releaseAll() {
        fizzBuzz.release();
        fizz.release();
        buzz.release();
        n.release();
    }
}
