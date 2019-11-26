package ua.epam.javacore.hometask05.balancedsearchtree;

import java.util.ArrayList;
import java.util.Collections;

public class BalancedSearchTreeRunner {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        list.add("ert");
        list.add("dfg");
        list.add("cvb");
        list.add("asty");

        Collections.sort(list);
        System.out.println(list);

        BalancedSearchTree searchTree = new BalancedSearchTree();
        System.out.println(searchTree.makeTree(list));


    }
}
