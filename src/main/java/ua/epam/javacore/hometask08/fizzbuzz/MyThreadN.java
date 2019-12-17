package ua.epam.javacore.hometask08.fizzbuzz;

public class MyThreadN extends Thread {
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
            fizzBuzz.number();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
