package ua.epam.javacore.hometask09.creationalpatterns.builder;

public class CarBuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setCarBuilder(new SportCarBuilder());
        Car car1 = director.buildCar();

        director.setCarBuilder(new CityCarBuilder());
        Car car2 = director.buildCar();

        System.out.println(car1);
        System.out.println(car2);
    }
}
