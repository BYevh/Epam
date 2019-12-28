package ua.epam.javacore.hometask09.structuralpatterns.bridge;

public class YoungDriver implements CarDriver {
    @Override
    public void driveCar() {
        System.out.println("YD drive a car");
    }
}
