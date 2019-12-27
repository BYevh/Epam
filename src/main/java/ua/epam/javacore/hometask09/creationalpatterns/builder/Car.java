package ua.epam.javacore.hometask09.creationalpatterns.builder;

public class Car {
    private NameOfCars name;
    private String color;
    private int hiSpeed;

    public void setName(NameOfCars name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHiSpeed(int hiSpeed) {
        this.hiSpeed = hiSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", color='" + color + '\'' +
                ", hiSpeed=" + hiSpeed +
                '}';
    }
}
