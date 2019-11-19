package ua.epam.javacore.hometask02;

public class RemoveElementArray {

    public int removeElement(int[] ints, int val) {
        if(ints==null || ints.length==0) return 0;
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

        for (int i = 0; i < newLength; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        return newLength;
    }

}
