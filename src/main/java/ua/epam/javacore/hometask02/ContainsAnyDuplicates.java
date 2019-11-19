package ua.epam.javacore.hometask02;

public class ContainsAnyDuplicates {

    public boolean duplicates(int[] ints){
        if(ints==null || ints.length==0) return false;
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
