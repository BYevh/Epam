package ua.epam.javacore.hometask09.structuralpatterns.bridge;

public class ExperiencedDiver implements CarDriver {
    @Override
    public void driveCar() {
        System.out.println("ED drive a car");
    }
}
