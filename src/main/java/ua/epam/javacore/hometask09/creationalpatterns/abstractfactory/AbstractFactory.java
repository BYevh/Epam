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











