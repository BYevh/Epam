package ua.epam.javacore.hometask09.structuralpatterns.bridge;

public class SportCar extends Car {
    public SportCar(CarDriver driver) {
        super(driver);
    }

    @Override
    public void driveCar() {
        System.out.println("SC rides");
        driver.driveCar();
    }
}
