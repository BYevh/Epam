package ua.epam.javacore.hometask09.structuralpatterns.bridge;

public class CarCreator {
    public static void main(String[] args) {
        Car[] cars = {
                new SportCar(new YoungDriver()),
                new TruckCar(new ExperiencedDiver())
        };

        for (Car car: cars) {
            car.driveCar();
        }
    }
}
