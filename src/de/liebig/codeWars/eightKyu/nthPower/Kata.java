package de.liebig.codeWars.eightKyu.nthPower;

public class Kata {
    public static int nthPower(int[] array, int n) {
//        Best Practice fits in one line: 0-1ms
        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
//        First solution similar to best practice: 0-1ms
//        return firstSolution(array, n);
    }

    private static int firstSolution(int[] array, int n) {
        if (array.length > n) {
            return (int) Math.pow(array[n], n);
        } else {
            return -1;
        }
    }
}