package ua.epam.javacore.hometask09.structuralpatterns.decorator;

public class DriverDecorator implements Driver{
    Driver driver;

    public DriverDecorator(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String carDrive() {
        return driver.carDrive();
    }
}
