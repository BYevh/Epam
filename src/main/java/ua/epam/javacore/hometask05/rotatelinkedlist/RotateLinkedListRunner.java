package ua.epam.javacore.hometask05.rotatelinkedlist;

import java.util.LinkedList;
import java.util.SortedMap;

public class RotateLinkedListRunner {


    public static void main(String[] args) {

        LinkedList <String> myList = new LinkedList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");

        int rotates = 2;

        RotateLinkedList linkedList = new RotateLinkedList();
        System.out.println(linkedList.rotateLinkedList(myList, rotates));

    }


}
