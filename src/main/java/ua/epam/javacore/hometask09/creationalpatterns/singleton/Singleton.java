package ua.epam.javacore.hometask09.creationalpatterns.singleton;

public class Singleton {

    public static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
