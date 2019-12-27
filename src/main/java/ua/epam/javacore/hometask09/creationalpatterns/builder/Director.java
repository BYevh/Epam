package ua.epam.javacore.hometask09.creationalpatterns.builder;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar (){
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildColor();
        carBuilder.buildHiSpeed();

        Car car = carBuilder.getCar();

        return car;
    }

}
