package de.liebig.codeWars.eightKyu.replaceVowelToExclamation;

import java.util.regex.Pattern;

public class Solution {
//    used for alternative approach:
    private static Pattern vowels = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
    public static String replace(final String s) {
//        Alternative approach: 0-1ms
//        return vowels.matcher(s).replaceAll("!");
//        already Best practice: 0-1ms
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}
