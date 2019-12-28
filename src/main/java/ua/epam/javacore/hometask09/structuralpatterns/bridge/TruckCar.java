package ua.epam.javacore.hometask09.structuralpatterns.bridge;

public class TruckCar extends Car {
    protected TruckCar(CarDriver driver) {
        super(driver);
    }

    @Override
    public void driveCar() {
        System.out.println("TC rides");
        driver.driveCar();
    }
}
