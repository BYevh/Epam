package ua.epam.javacore.hometask06;

import java.util.Arrays;

public class SetWithMissingNumber {

    public int[] findMissingNumber(int[] ints) {
        if (ints == null || ints.length < 2) {
            return new int[]{-1};
        }

        Arrays.sort(ints);

        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == ints[i + 1]) {
                return new int[]{ints[i], ints[i] + 1};
            }
        }

        return new int[]{-1};
    }
}
