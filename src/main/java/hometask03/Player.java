package hometask03;

public class Player {
    private String name;
    private Result nameOfResult;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Result getNameOfResult() {
        return nameOfResult;
    }

    public void setNameOfResult(int nameOfResult) {
        switch (nameOfResult) {
            case 1: {
                this.nameOfResult = Result.ROCK;
                break;
            }
            case 2: {
                this.nameOfResult = Result.PAPER;
                break;
            }
            case 3: {
                this.nameOfResult = Result.SCISSORS;
                break;
            }
        }
    }
}
