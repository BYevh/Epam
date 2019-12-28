package ua.epam.javacore.hometask09.structuralpatterns.bridge;

public abstract class Car {

    protected CarDriver driver;

    protected Car(CarDriver driver) {
        this.driver = driver;
    }

    public abstract void driveCar();

}
