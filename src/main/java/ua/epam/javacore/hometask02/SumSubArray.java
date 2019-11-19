package ua.epam.javacore.hometask02;

public class SumSubArray {

    public int sumSubArray(int[] ints) {
        if(ints==null || ints.length==0) return 0;
        int maxSum = 0;
        int sum;
        for (int i = 0; i < ints.length; i++) {
            sum = 0;
            for (int j = i; j < ints.length; j++) {
                sum += ints[j];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
