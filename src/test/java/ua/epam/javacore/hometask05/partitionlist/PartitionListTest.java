package ua.epam.javacore.hometask05.partitionlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    @Test
    void partitionList_NOT_NULL() {
        PartitionList partitionList = new PartitionList();
        Assert.assertNotNull(partitionList.partitionList(null,0));
    }

    @Test
    void partitionList_RIGHT_ANSWER() {
        PartitionList partitionList = new PartitionList();
        LinkedList <Integer>list = new LinkedList(Arrays.asList(0,1,2,4,1));
        LinkedList actual = partitionList.partitionList(list,2);
        LinkedList expected = new LinkedList(Arrays.asList(0,1,1,2,4));
        Assert.assertEquals(expected,actual);
    }
}