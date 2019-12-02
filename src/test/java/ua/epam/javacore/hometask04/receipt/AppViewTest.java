package ua.epam.javacore.hometask04.receipt;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class AppViewTest {

    @Test
    void inputTotalAmount_RIGHT_RETURN() {
        ByteArrayInputStream in = new ByteArrayInputStream("500".getBytes());
        System.setIn(in);
        AppView input = new AppView();
        Double actual = input.inputTotalAmount();
        Double expected = 500.0d;
        Assert.assertEquals(actual, expected);
        System.setIn(System.in);
    }

}