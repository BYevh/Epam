package hometask02;

import java.util.Arrays;

public class PlusOneToArray {

//    public static void main(String[] args) {
//        int[] ints = {9, 9, 9, 9, 9};
//        System.out.println(Arrays.toString(plusToArray(ints)));
//    }

    public static int[] plusToArray(int[] ints) {
        int i = 1;
        int number = 1;

        ints[ints.length - 1] = ints[ints.length - 1] + number;
        while ((ints[ints.length - i] > 9) & (i < ints.length)) {
            ints[ints.length - i] = 0;
            i++;
            ints[ints.length - i] = ints[ints.length - i] + 1;
        }
        if (ints[0] > 9) {
            int[] newInts = new int[ints.length + 1];
            newInts[0] = 1;
            System.arraycopy(newInts, 1, ints, 0, ints.length);
            return newInts;
        }
        return ints;
    }

}
