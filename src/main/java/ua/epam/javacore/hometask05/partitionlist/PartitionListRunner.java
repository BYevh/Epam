package ua.epam.javacore.hometask05.partitionlist;

import java.util.LinkedList;

public class PartitionListRunner {
    public static void main(String[] args) {

        LinkedList <Integer>list = new LinkedList<Integer>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);

        int partition = 3;

        PartitionList partitionList = new PartitionList();
        System.out.println(partitionList.partitionList(list, partition));
    }
}
