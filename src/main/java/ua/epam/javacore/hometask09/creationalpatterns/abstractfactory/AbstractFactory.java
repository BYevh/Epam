package ua.epam.javacore.hometask09.creationalpatterns.abstractfactory;

public class AbstractFactory {
    Factories createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Car":
                return new SportCarFactory();
            case "Tank":
                return new TankFactories();
            default:
                return null;
        }
    }
}

interface Factories {
    SportCar createCar(String typeOfCar);
    Tank crateTank(String typeOfTank);
}

class SportCarFactory implements Factories {
    public SportCar createCar(String car) {
        switch (car) {
            case "Audi":
                return new Bmw();
            case "Toyota":
                return new Citroen();
            default:
                return null;
        }
    }

    @Override
    public Tank crateTank(String typeOfTank) {
        return null;
    }
}

interface SportCar {
    void drive();
}

class Citroen implements SportCar {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Bmw implements SportCar {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class TankFactories implements Factories {


    @Override
    public SportCar createCar(String typeOfCar) {
        return null;
    }

    @Override
    public Tank crateTank(String typeOfTank) {
        switch (typeOfTank) {
            case "MkI":
                return new MkI();
            case "Leopard":
                return new Leopard();
            default:
                return null;
        }
    }
}

interface Tank {
    void drive();
}

class MkI implements Tank {
    @Override
    public void drive() {
        System.out.println("drive MkI");
    }
}

class Leopard implements Tank {
    @Override
    public void drive() {
        System.out.println("drive Leopard");
    }
}
