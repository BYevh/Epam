package ua.epam.javacore.hometask09.creationalpatterns.builder;

public class SportCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName(NameOfCars.BMW);
    }

    @Override
    void buildColor() {
        car.setColor("blue");
    }

    @Override
    void buildHiSpeed() {
        car.setHiSpeed(380);
    }
}
