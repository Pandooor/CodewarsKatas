package de.pandooor.codeWars.eightKyu.removeExclamationMarks;

public class Kata {
    public static String remove(String s, int n) {
//      Already Best Practice: 4-6ms
//        for (int i = 0; i < n; i++) {
//            s = s.replaceFirst("!", "");
//        }
//        return s;
//        Alternative approach: 0-1ms
        return alternativeApproach(s, n);
    }

    private static String alternativeApproach(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char d : s.toCharArray()) {
            if(n > 0 && d == '!') {
                n--;
            }
            else {
                sb.append(d);
            }
        }
        return sb.toString();
    }
}
