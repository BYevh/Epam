package ua.epam.javacore.hometask09.structuralpatterns.decorator;

public class AutoMechanic extends DriverDecorator {
    public AutoMechanic(Driver driver) {
        super(driver);
    }

    public String repairСar(){
        return " Repair the car. ";
    }

    @Override
    public String carDrive() {
        return super.carDrive() + repairСar();
    }
}
