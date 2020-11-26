package de.liebig.codeWars.eightKyu.sortAndStar;

import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {
//        Best Practice: 1-2ms
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
//        First Solution: 10-13ms
//        return firstSolution(s);
    }

    private static String firstSolution(String[] s) {
        Arrays.sort(s);
        StringBuilder sB = new StringBuilder(s[0].length() * 4);
        for (int i = 0; i < s[0].length(); i++) {
            if (i < s[0].length() - 1) {
                sB.append(s[0].charAt(i) + "***");
            } else {
                sB.append(s[0].charAt(i));
            }
        }
        return sB.toString();
    }
}
