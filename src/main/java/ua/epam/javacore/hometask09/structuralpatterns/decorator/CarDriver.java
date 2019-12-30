package ua.epam.javacore.hometask09.structuralpatterns.decorator;

public class CarDriver implements Driver {
    @Override
    public String carDrive() {
        return "Drive car.";
    }
}
