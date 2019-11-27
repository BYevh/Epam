package ua.epam.javacore.hometask05.rotatelinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

class RotateLinkedListTest {

    @Test
    void rotateLinkedList_NOT_NULL() {
        RotateLinkedList list = new RotateLinkedList();
        Assert.assertNotNull(list.rotateLinkedList(null, 0));
    }

    @Test
    void rotateLinkedList_RIGHT_ANSWER() {
        RotateLinkedList list = new RotateLinkedList();
        LinkedList myList = new LinkedList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        LinkedList actual = list.rotateLinkedList(myList, 1);
        LinkedList expected = new LinkedList(Arrays.asList("three", "one", "two"));
        Assert.assertEquals(expected, actual);
    }
}