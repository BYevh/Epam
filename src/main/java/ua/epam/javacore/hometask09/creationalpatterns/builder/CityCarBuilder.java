package ua.epam.javacore.hometask09.creationalpatterns.builder;

public class CityCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName(NameOfCars.CITROEN);
    }

    @Override
    void buildColor() {
        car.setColor("white");
    }

    @Override
    void buildHiSpeed() {
        car.setHiSpeed(180);
    }
}
