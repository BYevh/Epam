package ua.epam.javacore.hometask05.partitionlist;

import java.util.LinkedList;

public class PartitionList {

    public LinkedList partitionList(LinkedList<Integer> myList, int partition) {

        int indexOfPartition = myList.indexOf(partition);
        int temp;

        for (int i = indexOfPartition; i < myList.size()-1; i++) {
            if (myList.get(i + 1) <= partition) {
                temp = myList.remove(i + 1);
                for (int j = 0; j < myList.indexOf(partition); j++) {
                    if (myList.get(j) >= temp) {
                        myList.add(j, temp);
                        break;
                    }
                }
            }
        }

        return myList;
    }
}
