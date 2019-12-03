package ua.epam.javacore.hometask06;

import java.util.HashSet;
import java.util.Set;

public class KindsOfCandies {

    public int kindsOfCandies(int[] ints) {
        if (ints == null || ints.length < 2) {return 0;}

        Set<Integer> kinds = new HashSet<Integer>();
        for (int n : ints) {
            kinds.add(n);
        }

        return Math.min(ints.length / 2, kinds.size());
    }
}
