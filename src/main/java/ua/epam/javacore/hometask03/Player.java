package ua.epam.javacore.hometask03;

public class Player {
    private String name;
    private NameOfResults results;
    private int score = 0;


    public int getScore() {
        return score;
    }

    public void incScore() {
        this.score++;
    }


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public NameOfResults getResults() {
        return results;
    }

    public void setResults(int results) {
        switch (results) {
            case 1: {
                this.results = this.results.ROCK;
                break;
            }
            case 2: {
                this.results = this.results.PAPER;
                break;
            }
            case 3: {
                this.results = this.results.SCISSORS;
                break;
            }
        }
    }
}
