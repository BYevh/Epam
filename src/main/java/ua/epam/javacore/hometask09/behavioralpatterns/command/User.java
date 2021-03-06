package ua.epam.javacore.hometask09.behavioralpatterns.command;

//invoker

public class User {
    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComputer(){
        start.execute();
    }

    public void stopComputer(){
        stop.execute();
    }

    public void resetComputer(){
        reset.execute();
    }

}
