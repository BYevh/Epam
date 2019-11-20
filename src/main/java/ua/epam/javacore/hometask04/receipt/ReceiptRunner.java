package ua.epam.javacore.hometask04.receipt;

public class ReceiptRunner {
    public static void main(String[] args) {

        BusinessLogic businessLogic = new BusinessLogic();
        System.out.println(businessLogic.createReceipt());

    }
}
