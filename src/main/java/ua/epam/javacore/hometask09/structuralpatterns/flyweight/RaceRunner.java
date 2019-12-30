package ua.epam.javacore.hometask09.structuralpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class RaceRunner {
    public static void main(String[] args) {
        DriverFactory factory = new DriverFactory();
        List<Driver> drivers = new ArrayList<>();

        drivers.add(factory.getDriverBySpecialty("truck"));
        drivers.add(factory.getDriverBySpecialty("truck"));
        drivers.add(factory.getDriverBySpecialty("truck"));
        drivers.add(factory.getDriverBySpecialty("truck"));
        drivers.add(factory.getDriverBySpecialty("truck"));
        drivers.add(factory.getDriverBySpecialty("sport"));
        drivers.add(factory.getDriverBySpecialty("sport"));
        drivers.add(factory.getDriverBySpecialty("sport"));
        drivers.add(factory.getDriverBySpecialty("sport"));
        drivers.add(factory.getDriverBySpecialty("sport"));

        for (Driver driver: drivers) {
            driver.driveCar();
            
        }

    }
}
