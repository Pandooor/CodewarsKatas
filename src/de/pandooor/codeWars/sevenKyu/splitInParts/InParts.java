package de.pandooor.codeWars.sevenKyu.splitInParts;

import java.util.ArrayList;

public class InParts {
    public static String splitInParts(String s, int partLength) {
//        Best Practice: 11-17ms
        return s.replaceAll("(.{"+partLength+"})(?!$)", "$1 ");
//        first Solution: 0-2ms
//        return firstSolution(s, partLength);
    }

    private static String firstSolution(String s, int partLength) {
        StringBuilder sb = new StringBuilder(s);
        int n = (int) Math.floor(s.length() / partLength);
        if (s.length() % partLength == 0) {
            n--;
        }
        for (int i = 1; i <= n; i++) {
            sb.insert((partLength + 1) * i - 1, " ");
        }
        return sb.toString();
    }
}