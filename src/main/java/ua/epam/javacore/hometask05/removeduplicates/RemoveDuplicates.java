package ua.epam.javacore.hometask05.removeduplicates;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {

    public int removeDuplicates(ArrayList list) {
        if (list == null) {
            return 0;
        }
        for (int i = 0; i < list.size()-1 ; i++) {
            if (list.get(i) == list.get(i+1)){
                list.remove(i);
                i--;
            }
        }
        return list.size();
    }
}
