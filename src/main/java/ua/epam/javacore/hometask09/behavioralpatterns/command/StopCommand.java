package ua.epam.javacore.hometask09.behavioralpatterns.command;

public class StopCommand implements Command{
    Comp computer;

    public StopCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
