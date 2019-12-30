package ua.epam.javacore.hometask09.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static final Map<String, Driver> DRIVER_MAP = new HashMap<>();

    public Driver getDriverBySpecialty(String specialization) {
        Driver driver = DRIVER_MAP.get(specialization);

        if (driver == null) {
            switch (specialization) {
                case "truck":
                    System.out.println("Hiring truck driver..");
                    driver = new TruckDriver();
                    break;
                case "sport":
                    System.out.println("HIring sport driver..");
                    driver = new SportDriver();
            }
            DRIVER_MAP.put(specialization, driver);
        }
        return driver;
    }
}
