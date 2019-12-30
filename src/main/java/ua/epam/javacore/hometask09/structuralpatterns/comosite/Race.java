package ua.epam.javacore.hometask09.structuralpatterns.comosite;

public class Race {
    public static void main(String[] args) {

        RacersTeam team = new RacersTeam();

        Driver firstDriver = new YoungDriver();
        Driver secondDriver = new YoungDriver();
        Driver thirdDriver = new ExperiencedDriver();

        team.addDriver(firstDriver);
        team.addDriver(secondDriver);
        team.addDriver(thirdDriver);

        team.createRace();
    }
}
