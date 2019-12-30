package ua.epam.javacore.hometask09.structuralpatterns.facade;

import ua.epam.javacore.hometask09.creationalpatterns.builder.Car;
import ua.epam.javacore.hometask09.structuralpatterns.comosite.Race;

public class RaceRunner {

    public static void main(String[] args) {
        RaceCondition raceCondition = new RaceCondition();

        raceCondition.fixingCar();

    }
}
