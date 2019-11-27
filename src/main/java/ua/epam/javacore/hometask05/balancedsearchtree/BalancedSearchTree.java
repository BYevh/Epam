package ua.epam.javacore.hometask05.balancedsearchtree;

import java.util.ArrayList;
import java.util.TreeSet;

public class BalancedSearchTree {

    public TreeSet <String> makeTree (ArrayList <String> list){
        if (list == null) return new TreeSet();
        TreeSet newTreeSet = new TreeSet();
        newTreeSet.addAll(list);

        return newTreeSet;
    }
}
