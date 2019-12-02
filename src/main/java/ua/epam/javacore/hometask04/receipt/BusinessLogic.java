package ua.epam.javacore.hometask04.receipt;

import java.util.Date;

public class BusinessLogic {

    public Receipt createReceipt(double amount) {
        Receipt receipt = new Receipt(amount);
        receipt.setDate(new Date());
        receipt.setDiscount(logicDiscount(receipt.getTotalAmount()));
        receipt.setAmountWithDiscount((1 - receipt.getDiscount() / 100) * receipt.getTotalAmount());
        return receipt;
    }

    public double logicDiscount(double totalAmount) {
        if (totalAmount == 0) return 0;
        double discount;

        if (totalAmount <= 500) {
            discount = 5;
        } else if (totalAmount >= 501 & totalAmount <= 1000) {
            discount = 10;
        } else discount = 15;

        return discount;

    }


}
