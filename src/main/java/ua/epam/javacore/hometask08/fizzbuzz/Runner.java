package ua.epam.javacore.hometask08.fizzbuzz;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fizzBuzz = FizzBuzz.getInstance();
        fizzBuzz.setBound(15);

        MyThreadFizz threadFizz = new MyThreadFizz();
        MyThreadBuzz threadBuzz = new MyThreadBuzz();
        MyThreadFizzBuzz threadFizzBuzz = new MyThreadFizzBuzz();
        MyThreadN threadN = new MyThreadN();

        fizzBuzz.release();
        threadBuzz.start();
        threadFizz.start();
        threadFizzBuzz.start();
        threadN.start();


    }
}
