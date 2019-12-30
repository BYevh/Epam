package ua.epam.javacore.hometask09.structuralpatterns.comosite;

import java.util.ArrayList;
import java.util.List;

public class RacersTeam {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void removeDriver (Driver driver){
        drivers.remove(driver);
    }

    public void createRace(){
        System.out.println("Team create Race..");
        for (Driver driver: drivers){
            driver.driveCar();
        }
    }
}
