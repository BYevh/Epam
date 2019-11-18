package hometask03;

import java.util.Scanner;

public class GameRunner {
    private static final String GREETINGS = "Hi all! It's a game: ";
    private static final String NAME_OF_GAME = "\"Rock, Paper or Scissors\"";
    private static final String INPUT_NAME = "Input your Name: ";
    private static final String PLAYER2_NAME = "Computer";



    public static void main(String[] args) {
        System.out.println(GREETINGS + NAME_OF_GAME + INPUT_NAME);
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player(PLAYER2_NAME);
        Logic newGame = new Logic();

        while (true) {
            int number = newGame.number();
            if (number == 0) break;
            player1.setNameOfResult(number);
            player2.setNameOfResult(newGame.diceRoll());
            System.out.println(player1.getName() + " : " + player1.getNameOfResult());
            System.out.println(player2.getName() + " : " + player2.getNameOfResult());
            System.out.println(newGame.resultOfRolls(player1, player2));
        }

        scanner.close();

    }
}
