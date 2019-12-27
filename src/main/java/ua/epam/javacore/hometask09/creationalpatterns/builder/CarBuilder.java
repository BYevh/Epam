package ua.epam.javacore.hometask09.creationalpatterns.builder;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildName();
    abstract void buildColor();
    abstract void buildHiSpeed();

    Car getCar(){
        return car;
    }

}
