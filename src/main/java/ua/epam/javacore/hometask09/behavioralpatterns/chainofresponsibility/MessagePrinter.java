package ua.epam.javacore.hometask09.behavioralpatterns.chainofresponsibility;

public abstract class MessagePrinter {
    MessagePrinter nexMessagePrinter;

    public void setNexMessagePrinter(MessagePrinter nexMessagePrinter) {
        this.nexMessagePrinter = nexMessagePrinter;
    }

    void print(String message){
        printMessage(message);
        if (nexMessagePrinter != null ){
            nexMessagePrinter.print(message);
        }
    }
    abstract void printMessage(String message);

}
