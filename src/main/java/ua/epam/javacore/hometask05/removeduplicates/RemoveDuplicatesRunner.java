package ua.epam.javacore.hometask05.removeduplicates;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDuplicatesRunner {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);


        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(list));

    }
}
