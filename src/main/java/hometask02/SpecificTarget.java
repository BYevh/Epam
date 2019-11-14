package hometask02;

import java.util.Arrays;

public class SpecificTarget {
//    public static void main(String[] args) {
//
//        int[] ints = {2, 7, 11, 15};
//        int target = 9;
//        System.out.println(Arrays.toString(target(ints, target)));
//
//    }

    public static int[] target(int[] ints, int target) {
        int[] result = new int[2];
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = (i + 1); j < ints.length; j++) {
                if ((ints[i] + ints[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
