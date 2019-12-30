package ua.epam.javacore.hometask09.behavioralpatterns.chainofresponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new ConsoleMessagePrinter();
        FileMessagePrinter fileMessagePrinter = new FileMessagePrinter();
        messagePrinter.setNexMessagePrinter(fileMessagePrinter);
        fileMessagePrinter.setNexMessagePrinter(new DataBaseMessagePrinter());
        messagePrinter.print("Hello All");
    }
}
