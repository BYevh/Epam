package ua.epam.javacore.hometask08.threethreadsinline;

public class MyThread extends Thread {

    //3 threads call. Each thread have to be named - 1 or 2 or 3, it depends on what it wants to output

    public MyThread(String name) {
        super(name);
    }

    ThreeThreadsInLine threeThreadsInLine = ThreeThreadsInLine.getInstance();

    @Override
    public void run() {
        try {
            if (currentThread().getName().equals("1")) threeThreadsInLine.first();
            if (currentThread().getName().equals("2")) threeThreadsInLine.second();
            if (currentThread().getName().equals("3")) threeThreadsInLine.third();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
