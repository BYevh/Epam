package ua.epam.javacore.hometask09.creationalpatterns.factory;



public class Factory {
    public Car createCar(String car) {
        switch (car) {
            case "Audi":
                return new Audi();
            case "Toyota":
                return new Toyota();
            default:
                return null;
        }
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}