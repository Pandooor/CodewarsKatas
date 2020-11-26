package de.liebig.codeWars.sevenKyu.simpleStringCharacters;

public class Kata {

    public static int[] Solve(String word) {
//        Best Practice: 4ms
//        all characters not being specified one get elminated and then the length is taken
        return new int[]{
                word.replaceAll("[^A-Z]", "").length(),
                word.replaceAll("[^a-z]", "").length(),
                word.replaceAll("[^0-9]", "").length(),
                word.replaceAll("[\\w]", "").length() // \\w is short for a-zA-Z_0-9
        };
//        First Solutiono: 1-2ms
//        return firstSolution(word);
    }

    private static int[] firstSolution(String word) {
        int[] counter = new int[4];
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > 47 && letters[i] < 58) {
                counter[2]++;
            } else if (letters[i] > 64 && letters[i] < 91) {
                counter[0]++;
            } else if (letters[i] > 96 && letters[i] < 123) {
                counter[1]++;
            } else {
                counter[3]++;
            }
        }
        return counter;
    }
}