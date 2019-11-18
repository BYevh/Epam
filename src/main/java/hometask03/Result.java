package hometask03;

public enum Result {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int code;

    Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
