package hometask02;

public class ContainsAnyDuplicates {

//    public static void main(String[] args) {
//        int[] ints = {1, 2, 3, 4};
//        System.out.println(duplicates(ints));
//    }

    public static boolean duplicates(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
