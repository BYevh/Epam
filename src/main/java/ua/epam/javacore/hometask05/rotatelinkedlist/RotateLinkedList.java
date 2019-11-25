package ua.epam.javacore.hometask05.rotatelinkedlist;

import java.util.LinkedList;

public class RotateLinkedList {

    public void rotateLinkedList(LinkedList list, int n) {
        for (int i = 0; i < n; i++) {
            list.addFirst(list.get(list.size() - 1));
            list.removeLast();
        }

    }
}
