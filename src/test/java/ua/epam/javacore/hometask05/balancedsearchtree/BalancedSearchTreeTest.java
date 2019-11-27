package ua.epam.javacore.hometask05.balancedsearchtree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

class BalancedSearchTreeTest {

    @Test
    void makeTree_NOT_NULL() {
        BalancedSearchTree searchTree = new BalancedSearchTree();
        TreeSet<String> actual = searchTree.makeTree(null);
        Assert.assertNotNull(actual);
    }

    @Test
    void makeTree_RIGHT_RESULT() {
        BalancedSearchTree searchTree = new BalancedSearchTree();
        ArrayList list = new ArrayList(Arrays.asList("ab","cd","em"));
        TreeSet<String> actual = searchTree.makeTree(list);
        TreeSet expected = new TreeSet(list);
        Assert.assertEquals(expected, actual);
    }
}