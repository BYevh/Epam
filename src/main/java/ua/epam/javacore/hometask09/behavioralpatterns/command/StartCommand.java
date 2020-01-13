package ua.epam.javacore.hometask09.behavioralpatterns.command;

public class StartCommand implements Command{
    Comp computer;

    public StartCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
