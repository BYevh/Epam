package ua.epam.javacore.hometask08.fizzbuzz;

public class MyThreadFizzBuzz extends Thread {
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
            fizzBuzz.fizzBuzz();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
