package de.liebig.codeWars.eightKyu.convertNumberToReverseArray;

public class Kata {
    public static int[] digitize(long n) {
//        Best Practice: 4-5ms
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
//        return firstSolution(n); //11-15ms
    }

    private static int[] firstSolution(long n) {
        String str = Long.toString(n);
        StringBuilder sB = new StringBuilder(str);
        sB.reverse();
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = Integer.parseInt(sB.charAt(i) + "");
        }
        return answer;
    }
}