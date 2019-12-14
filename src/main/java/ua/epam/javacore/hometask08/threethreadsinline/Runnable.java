package ua.epam.javacore.hometask08.threethreadsinline;

public class Runnable {

    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread("1");
        MyThread thread2 = new MyThread("2");
        MyThread thread3 = new MyThread("3");
        thread2.start();
        thread1.start();
        thread3.start();




    }

}
