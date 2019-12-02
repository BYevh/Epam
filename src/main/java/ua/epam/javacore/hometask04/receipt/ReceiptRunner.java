package ua.epam.javacore.hometask04.receipt;

public class ReceiptRunner {
    public static void main(String[] args) {

        BusinessLogic businessLogic = new BusinessLogic();
        AppView appView = new AppView();
        appView.viewReceipt(businessLogic.createReceipt(appView.inputTotalAmount()));

    }
}
