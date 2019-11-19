package ua.epam.javacore.hometask03;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LogicTest {


    @Test
    void number() {
        Logic logic = new Logic();


    }

    @Test
    void resultOfRolls() {

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