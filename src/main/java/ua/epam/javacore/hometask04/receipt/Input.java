package ua.epam.javacore.hometask04.receipt;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    private static final String MASSAGE_ERROR1 = "Only number!";
    private static final String MASSAGE_TOTAL_AMOUNT = "Enter total amount: ";

    public double inputTotalAmount (){
        int totalAmount;
        do {
            System.out.println(MASSAGE_TOTAL_AMOUNT);
            while (!scanner.hasNextInt()) {
                System.out.println(MASSAGE_ERROR1);
                scanner.next();
            }
            totalAmount = scanner.nextInt();
        }
        while ( totalAmount <= 0);

        return totalAmount;
    }

}
