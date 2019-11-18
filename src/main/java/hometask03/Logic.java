package hometask03;

import java.util.Random;
import java.util.Scanner;

public class Logic {
    private String result;
    private static final String INPUT_ANSWER = "\nInput your number (1-rock / 2-paper / 3-scissors / 0 - exit):";
    private static final String WINNER = "Winner: ";
    private static final String MASSAGE_TIE = "A tie!";
    private static final String MASSAGE_ERROR1 = "That not a number!";

    //input and validation
    public int number(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println(INPUT_ANSWER);
            while (!scanner.hasNextInt()) {
                System.out.println(MASSAGE_ERROR1);
                scanner.next();
            }
            number = scanner.nextInt();
        }
        while ( number < 1 & number > 3);
        return number;
    }


    //  check the winner
    public String resultOfRolls(Player player1, Player player2) {

        int p1 = player1.getNameOfResult().getCode();
        int p2 = player2.getNameOfResult().getCode();
        int deltaP = p1 - p2;

        if (deltaP == 0) {
            result = MASSAGE_TIE;
        } else if (Math.abs(deltaP) == 1) {
            result = (deltaP > 0) ? (WINNER + player1.getName()) : (WINNER + player2.getName());
        } else if (Math.abs(deltaP) == 2) {
            result = (deltaP > 0) ? (WINNER + player2.getName()) : (WINNER + player1.getName());
            ;
        }
        return result;
    }

// random number
    public int diceRoll() {
        Random random = new Random();
        return (random.nextInt(3) + 1);
    }
}
