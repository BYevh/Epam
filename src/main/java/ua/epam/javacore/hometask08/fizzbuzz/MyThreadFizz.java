package ua.epam.javacore.hometask08.fizzbuzz;

public class MyThreadFizz extends Thread {
    public MyThreadFizz() throws InterruptedException {
    }

    private FizzBuzz fizzBuzz = FizzBuzz.getInstance();

    @Override
    public void run() {
        try {
            fizzBuzz.fizz();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
