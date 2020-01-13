package ua.epam.javacore.hometask09.behavioralpatterns.command;

public class CommandRunner {
    public static void main(String[] args) {
        Comp computer = new Comp();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
