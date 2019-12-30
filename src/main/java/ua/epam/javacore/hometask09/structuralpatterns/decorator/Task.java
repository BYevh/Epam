package ua.epam.javacore.hometask09.structuralpatterns.decorator;

public class Task {
    public static void main(String[] args) {
        Driver driver = new AutoMechanic(new CarDriver());

        System.out.println(driver.carDrive());
    }
}
