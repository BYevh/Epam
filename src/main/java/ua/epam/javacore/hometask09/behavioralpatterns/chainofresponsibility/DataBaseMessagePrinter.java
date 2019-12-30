package ua.epam.javacore.hometask09.behavioralpatterns.chainofresponsibility;

public class DataBaseMessagePrinter extends MessagePrinter {
    @Override
    void printMessage(String message) {
        System.out.println("Write to Data Base: " + message);
    }
}
