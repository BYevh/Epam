package hometask03;

import java.util.Scanner;

public class GameRunner {
    private static final String GREETINGS = "Hi all! It's a game: ";
    private static final String NAME_OF_GAME = "\"Rock, Paper or Scissors\"";
    private static final String INPUT_NAME = "\nInput your Name: ";
    private static final String PLAYER2_NAME = "Computer";



    public static void main(String[] args) {
        System.out.println(GREETINGS + NAME_OF_GAME + INPUT_NAME);
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player(PLAYER2_NAME);
        Logic newGame = new Logic();

        while (true) {
            int number = newGame.number();                                              // input throw number
            if (number == 0) break;                                                     // 0 - exit

            player1.setNameOfResult(number);                                            //enter the entered result
            player2.setNameOfResult(newGame.diceRoll());                                //enter the random result

            System.out.println(player1.getName() + " : " + player1.getNameOfResult());  // display throws on the screen
            System.out.println(player2.getName() + " : " + player2.getNameOfResult());
            System.out.println(newGame.resultOfRolls(player1, player2));                // determine the winner
        }

        scanner.close();

    }
}
