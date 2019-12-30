package ua.epam.javacore.hometask09.structuralpatterns.proxy;

public class DriverProxy implements Driver{
    Driver driver = new CarDriver();

    @Override
    public void driveCar() {
        System.out.println("fill the car");
        driver.driveCar();
    }
}
