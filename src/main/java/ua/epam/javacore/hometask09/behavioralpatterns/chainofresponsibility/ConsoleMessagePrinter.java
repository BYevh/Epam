package ua.epam.javacore.hometask09.behavioralpatterns.chainofresponsibility;

public class ConsoleMessagePrinter extends MessagePrinter{

    @Override
    void printMessage(String message) {
        System.out.println("Print to console: " + message);
    }
}
