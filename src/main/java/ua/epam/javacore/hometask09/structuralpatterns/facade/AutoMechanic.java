package ua.epam.javacore.hometask09.structuralpatterns.facade;

public class AutoMechanic {
    private boolean fixingCar;

    public boolean isFixingCar() {
        return fixingCar;
    }

    public void startFixingCar() {
        System.out.println("Fixing is active");
        this.fixingCar = true;
    }

    public void finishFixingCar() {
        System.out.println("Fixing is done");
        this.fixingCar = false;
    }
}
