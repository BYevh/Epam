package hometask02;

import java.util.Arrays;

public class RemoveElementArray {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 2, 3, 0, 4, 0};
        int val = 2;
        System.out.println(removeElement(ints, val));

    }

    public static int removeElement(int[] ints, int val) {
        int newLength = ints.length;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == val) {
                for (int j = i; j < (ints.length - 1); j++) {
                    ints[j] = ints[j + 1];
                }
                ints[ints.length - 1] = 0;
                newLength--;
                i--;
            }
        }

        System.out.println(Arrays.toString(ints));

        return newLength;
    }

}
