package de.liebig.codeWars.eightKyu.validationOfUsername;

public class ZywOo {
    public static boolean validateUsr(String s) {
//        Best Practice: 1-2ms
        return s.matches("[a-z_\\d]{4,16}"); //[] surrounds a regex, \\d stand for numbers from 0-9, {} controls a length
//        return firstSolution(s); // 0-1ms
    }

    private static boolean firstSolution(String s) {
        if (s.length() < 4 || s.length() > 16) {
            return false;
        }
        if (!(s.toLowerCase().equals(s))) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char charToTest = s.charAt(i);
            if (charToTest == 95) { //underscore
                continue;
            }
            if (charToTest > 122) { //no more letters
                return false;
            }
            if (charToTest < 97) { //no small letters
                if (charToTest < 48 || charToTest > 57) { //no numbers
                    return false;
                }
            }
        }
        return true;
    }
}