package ua.epam.javacore.hometask03;

public enum NameOfResults {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int code;

    NameOfResults(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
