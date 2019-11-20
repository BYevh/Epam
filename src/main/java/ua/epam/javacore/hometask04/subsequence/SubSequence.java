package ua.epam.javacore.hometask04.subsequence;

public class SubSequence {


    public String subSequence(String s1, String s2) {
        int lengthSubString = 0;
        String mySubString = "";
        String longStr;
        String shortStr;

        if (s1.length() >= s2.length()) {
            longStr = s1;
            shortStr = s2;
        } else {
            longStr = s2;
            shortStr = s1;
        }

        for (int i = 0; i < shortStr.length(); i++) {
            for (int j = 0; j < i; j++) {
                String subStrShort = shortStr.substring(j, (i + 1));
                if (longStr.contains(subStrShort) & (subStrShort.length() > lengthSubString)) {
                    mySubString = subStrShort;
                    lengthSubString++;
                }
            }
        }

        return mySubString;
    }
}
