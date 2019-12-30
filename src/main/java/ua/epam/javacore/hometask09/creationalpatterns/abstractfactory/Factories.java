package ua.epam.javacore.hometask09.creationalpatterns.abstractfactory;

interface Factories {
    SportCar createCar(String typeOfCar);

    Tank crateTank(String typeOfTank);
}