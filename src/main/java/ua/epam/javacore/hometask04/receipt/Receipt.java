package ua.epam.javacore.hometask04.receipt;

import java.util.Date;

public class Receipt {
    private Date date;
    private double totalAmount;
    private double discount;
    private double amountWithDiscount;

    public Receipt(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmountWithDiscount() {
        return amountWithDiscount;
    }

    public void setAmountWithDiscount(double amountWithDiscount) {
        this.amountWithDiscount = amountWithDiscount;
    }

    @Override
    public String toString() {
        return "Receipt:\n" +
                " Date = " + date +
                ",\n TotalAmount = " + totalAmount +
                "$,\n Discount = " + discount +
                "%,\n Amount with discount = " + amountWithDiscount + "$";
    }
}
