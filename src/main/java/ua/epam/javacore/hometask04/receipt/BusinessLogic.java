package ua.epam.javacore.hometask04.receipt;

import java.util.Date;

public class BusinessLogic {

    public Receipt createReceipt() {
        Receipt receipt = new Receipt();
        Input input = new Input();
        receipt.setDate(new Date());
        receipt.setTotalAmount(input.inputTotalAmount());
        receipt.setDiscount(logicDiscount(receipt.getTotalAmount()));
        receipt.setAmountWithDiscount((1 - receipt.getDiscount() / 100) * receipt.getTotalAmount());
        return receipt;
    }

    public double logicDiscount(double totalAmount) {
        double discount;

        if (totalAmount <= 500) {
            discount = 5;
        } else if (totalAmount >= 501 & totalAmount <= 1000) {
            discount = 10;
        } else discount = 15;

        return discount;

    }


}