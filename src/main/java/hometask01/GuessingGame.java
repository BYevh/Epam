package hometask01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessingGame {

    private static final String ENTER = "Guess the number from 1 to 1000: ";
    private static final String LOW = "Too low.\nTry again:";
    private static final String HIGH = "Too high.\nTry again:";
    private static final String TRUE = "Yes!";
    private static final String ERROR = "Only number.\nTry again:";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int random = new Random().nextInt(1000);
        System.out.println(random);
        System.out.println(ENTER);
        int  number = 0;

        do {
            try {
                number = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println(ERROR);
                continue;
            }
            if (number < random) {
                System.out.println(LOW);
            } else if (number > random) {
                System.out.println(HIGH);
            }

        } while (number != random);

        System.out.println(TRUE);

        reader.close();
    }
}
