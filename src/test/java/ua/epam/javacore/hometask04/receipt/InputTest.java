package ua.epam.javacore.hometask04.receipt;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void inputTotalAmount_RIGHT_RETURN() {
        ByteArrayInputStream in = new ByteArrayInputStream("500".getBytes());
        System.setIn(in);
        Input input= new Input();
        Double actual = input.inputTotalAmount();
        Double expected = 500.0d;
        Assert.assertEquals(actual, expected);
        System.setIn(System.in);
    }

}