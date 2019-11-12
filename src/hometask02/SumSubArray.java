package hometask02;

public class SumSubArray {

    public static void main(String[] args) {

        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sumSubArray(ints));

    }

    public static int sumSubArray(int[] ints) {
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
