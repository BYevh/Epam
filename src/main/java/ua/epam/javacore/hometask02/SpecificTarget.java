package ua.epam.javacore.hometask02;

public class SpecificTarget {

    public int[] target(int[] ints, int target) {
        if(ints==null || ints.length==0) return new int[0];
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
