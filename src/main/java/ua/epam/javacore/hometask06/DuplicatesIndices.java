package ua.epam.javacore.hometask06;

import java.util.HashMap;

public class DuplicatesIndices {


    public boolean findDuplicatesIndices(int[] ints, int k) {
        boolean b = false;
        if (ints == null || ints.length < 2) {return b;}

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < ints.length; i++) {
            if (myMap.containsKey(ints[i])) {
                if ( i - myMap.get(ints[i]) <= k){
                    b = true;
                    return b;
                }
            }
            myMap.put(ints[i], i);
        }
        return b;
    }
}
