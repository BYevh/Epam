package ua.epam.javacore.hometask08.threethreadsinline;

public class MyThread extends Thread {

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
