package ua.epam.javacore.hometask09.structuralpatterns.proxy;

public class DriverRunner {

    public static void main(String[] args) {
        Driver driver = new DriverProxy();
        driver.driveCar();
    }

}
