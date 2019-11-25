package ua.epam.javacore.hometask05.rotatelinkedlist;

import java.util.LinkedList;

public class RotateLinkedListRunner {


    public static void main(String[] args) {

        LinkedList myList = new LinkedList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");

        int rotates = 2;

        RotateLinkedList linkedList = new RotateLinkedList();
        linkedList.rotateLinkedList(myList, rotates);
        System.out.println(myList);
    }


}
