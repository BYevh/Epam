import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HW1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int random = new Random().nextInt(1000);
        System.out.println(random);
        System.out.println("Guess the number from 1 to 1000: ");
        int  number = 0;

        do {
            try {
                number = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Only number.\nTry again:");
                continue;
            }
            if (number < random) System.out.println("Too low.\nTry again:");
            else if (number > random) System.out.println("Too high.\nTry again:");

        } while (number != random);

        System.out.println("Yes!");

        reader.close();
    }
}
