package ua.epam.javacore.hometask09.creationalpatterns.builder;

public class Builder {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("asd");
        car.setHiSpeed(1212);
        car.setName(NameOfCars.BMW);

        System.out.println(car);
    }
}
