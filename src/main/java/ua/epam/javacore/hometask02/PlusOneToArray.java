package ua.epam.javacore.hometask02;

public class PlusOneToArray {

    public int[] plusToArray(int[] ints) {
        if(ints==null || ints.length==0) return new int[0];
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
