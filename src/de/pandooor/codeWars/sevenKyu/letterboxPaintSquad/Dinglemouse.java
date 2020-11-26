package de.pandooor.codeWars.sevenKyu.letterboxPaintSquad;

public class Dinglemouse {

    public static int[] paintLetterboxes(final int start, final int end) {
//        Best Practice: 12-15ms
        int[] frequencies = new int[10];
        for (int i = start; i <= end; i++){
            int num = i;
            while (num > 0){
                frequencies[num%10]++;
                num /= 10;
            }
        }
        return frequencies;
//        first Solution: 12-15ms
//        return firstSolution(start, end);
    }

    private static int[] firstSolution(int start, int end) {
        int[] answer = new int[10];
        for (int i = start; i <= end; i++) {
            char[] digits = String.valueOf(i).toCharArray();
            System.out.println(digits);
            for (int j = 0; j < digits.length; j++) {
                int number = Integer.valueOf(digits[j]+"");
                answer[number]++;
            }
        }
        return answer;
    }
}