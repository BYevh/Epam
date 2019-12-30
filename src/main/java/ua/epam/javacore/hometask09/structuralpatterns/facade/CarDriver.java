package ua.epam.javacore.hometask09.structuralpatterns.facade;

public class CarDriver {

    public void driveCarBeforeCrash(AutoMechanic autoMechanic){
        if (autoMechanic.isFixingCar()){
            System.out.println("Driver is smoking");
        } else {
            System.out.println("Driver is driving car");
        }
    }
}
