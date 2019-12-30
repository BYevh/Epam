package ua.epam.javacore.hometask09.structuralpatterns.proxy;

public class CarDriver implements Driver{
    @Override
    public void driveCar() {
        System.out.println("Driver drives a car");
    }
}
