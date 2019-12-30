package ua.epam.javacore.hometask09.creationalpatterns.abstractfactory;

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

