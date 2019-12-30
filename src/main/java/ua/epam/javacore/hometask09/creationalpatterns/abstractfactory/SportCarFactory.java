package ua.epam.javacore.hometask09.creationalpatterns.abstractfactory;

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
