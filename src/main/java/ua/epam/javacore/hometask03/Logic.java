package ua.epam.javacore.hometask03;

import java.util.Random;
import java.util.Scanner;

public class Logic {

    private String result;
    private static final String GREETINGS = "Hi all! It's a game: ";
    private static final String NAME_OF_GAME = "\"Rock, Paper or Scissors\"";
    private static final String INPUT_NAME = "\nInput your Name: ";
    private static final String PLAYER2_NAME = "Computer";
    private static final String INPUT_ANSWER = "\nInput your number (1-rock / 2-paper / 3-scissors / 0 - exit):";
    private static final String WINNER = "Winner: ";
    private static final String MASSAGE_TIE = "A tie!";
    private static final String MASSAGE_ERROR1 = "Only number!";

    Scanner scanner = new Scanner(System.in);

    public void startGame(){
        System.out.println(GREETINGS + NAME_OF_GAME + INPUT_NAME);

        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player(PLAYER2_NAME);

        while (true) {
            int number = number();                                              // input throw number
            if (number == 0) break;                                                     // 0 - exit

            player1.setResults(number);                                            //enter the entered result
            player2.setResults(diceRoll());                                //enter the random result

            System.out.println(player1.getName() + " : " + player1.getResults());  // display throws on the screen
            System.out.println(player2.getName() + " : " + player2.getResults());
            System.out.println(resultOfRolls(player1, player2));                // determine the winner
        }
    }


    //input and validation
    public int number(){
        int number;
        do {
            System.out.println(INPUT_ANSWER);
            while (!scanner.hasNextInt()) {
                System.out.println(MASSAGE_ERROR1);
                scanner.next();
            }
            number = scanner.nextInt();
        } while ( number < 1 | number > 3);
        return number;
    }


    //  check the winner
    public String resultOfRolls(Player player1, Player player2) {

        int p1 = player1.getResults().getCode();
        int p2 = player2.getResults().getCode();
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
