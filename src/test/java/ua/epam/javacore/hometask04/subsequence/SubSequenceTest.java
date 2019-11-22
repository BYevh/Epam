package ua.epam.javacore.hometask04.subsequence;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSequenceTest {

    @Test
    void subSequence_COINCIDENCE() {
        SubSequence subSequence = new SubSequence();
        String actual = subSequence.subSequence("qwerty", "qwerty");
        String expected = "qwerty";
        Assert.assertEquals(expected, actual);
    }
    @Test
    void subSequence_NO_COINCIDENCE() {
        SubSequence subSequence = new SubSequence();
        String actual = subSequence.subSequence("asdf", "qwerty");
        String expected = "";
        Assert.assertEquals(expected, actual);
    }
}