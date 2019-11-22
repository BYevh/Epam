package ua.epam.javacore.hometask03;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class LogicTest {



    @Test
    void number_NOT_NULL() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        Logic logic = new Logic();
        Assert.assertNotNull(logic.number());
        System.setIn(System.in);
    }


    @Test
    void resultOfRolls_RIGHT_NAME_WINNER() {
        Logic logic = new Logic();
        Player p1 = new Player("Name1");
        Player p2 = new Player("Name2");
        p1.setNameOfResult(1);
        p2.setNameOfResult(2);
        String actual = logic.resultOfRolls(p1, p2);
        String expected = "Winner: " + p2.getName();
        Assert.assertEquals (expected , actual);

    }

    @Test
    void diceRoll_OUT_OF_RANGE() {
        Logic logic = new Logic();
        int actual = logic.diceRoll();
        if (actual < 1 | actual > 3) Assert.fail();
    }

    @Test
    void diceRoll_IN_RANGE() {
        Logic logic = new Logic();
        int actual = logic.diceRoll();
        Assert.assertTrue (actual >= 1 | actual <= 3);
    }
}