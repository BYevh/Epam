package ua.epam.javacore.hometask09.behavioralpatterns.chainofresponsibility;

public class FileMessagePrinter extends  MessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("Write to file: " + message);
    }
}
