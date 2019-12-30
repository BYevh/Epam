package ua.epam.javacore.hometask09.structuralpatterns.facade;

public class RaceCondition  {
    CarDriver driver = new CarDriver();
    DrivingCar drivingCar = new DrivingCar();
    AutoMechanic mechanic = new AutoMechanic();

    public void fixingCar(){
        drivingCar.drivingCar();
        mechanic.startFixingCar();
        driver.driveCarBeforeCrash(mechanic);
    }
}
