package ua.epam.javacore.hometask05.rotatelinkedlist;

import java.util.LinkedList;

public class RotateLinkedList {

    public LinkedList rotateLinkedList(LinkedList list, int n) {
        if (list == null){
            return new LinkedList();
        }
        for (int i = 0; i < n; i++) {
            list.addFirst(list.get(list.size() - 1));
            list.removeLast();
        }
        return list;
    }
}
