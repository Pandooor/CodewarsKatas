package de.pandooor.codeWars.oldKatas;

public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        String answerString = "";
        String[] words = str.split(" ");
        for (int a = 0; a < words.length; a++) {
            if (words[a].equals(",") || words[a].equals(".") || words[a].equals("?") || words[a].equals("!")) {
                answerString = answerString + words[a] + " ";
            } else if (words[a].equals(" ")) {
                answerString = answerString + words[a];
            } else {
                String part = words[a].substring(1, words[a].length()) + words[a].substring(0, 1) + "ay";
                answerString = answerString + part + " ";
            }
        }

        answerString = answerString.substring(0, answerString.length() - 1);
        return answerString;
    }
}