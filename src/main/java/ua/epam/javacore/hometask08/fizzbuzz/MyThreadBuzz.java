package ua.epam.javacore.hometask08.fizzbuzz;

public class MyThreadBuzz extends Thread {

    private FizzBuzz fizzBuzz;

    {
        try {
            fizzBuzz = FizzBuzz.getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            fizzBuzz.buzz();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
