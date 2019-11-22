package ua.epam.javacore.hometask04.receipt;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicTest {

    @Test
    void createReceipt_NOT_NULL() {
        BusinessLogic businessLogic = new BusinessLogic();
        ByteArrayInputStream in = new ByteArrayInputStream("500".getBytes());
        System.setIn(in);
        Assert.assertNotNull(businessLogic.createReceipt());
        System.setIn(System.in);
    }

    @Test
    void logicDiscount_RIGHT_ANSWERS() {
        BusinessLogic businessLogic = new BusinessLogic();
        Double expected = 5d;
        Double actual = businessLogic.logicDiscount(500);
        Assert.assertEquals(expected, actual);
        expected = 10d;
        actual = businessLogic.logicDiscount(600);
        Assert.assertEquals(expected, actual);
        expected = 15d;
        actual = businessLogic.logicDiscount(10000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void logicDiscount_0() {
        BusinessLogic businessLogic = new BusinessLogic();
        Double expected = 0d;
        Double actual = businessLogic.logicDiscount(0);
        Assert.assertEquals(expected, actual);

    }

}