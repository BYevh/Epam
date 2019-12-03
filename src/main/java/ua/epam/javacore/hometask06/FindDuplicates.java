package ua.epam.javacore.hometask06;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public boolean findDuplicates(List<Integer> integerList) {
        boolean b = false;
        if (integerList == null || integerList.size() < 2) {
            return b;
        }
        Set<Integer> integerSet = new HashSet<Integer>(integerList);
        b = !(integerSet.size() == integerList.size());
        return b;
    }
}
