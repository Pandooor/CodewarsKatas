package de.pandooor.codeWars.oldKatas;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ThingsLearned {
    public static void main(String[] args) {
        //Maximum aus zwei Werten
        int value1 = 1;
        int value2 = 2;
        int a = Math.max(value1,value2);

        //arrayDeklaration und for each Schleife dafür-- value nimmt dabei die Werte an und nicht die Indizies
        int[] arr = new int[5];
        for (int value : arr) {

        }

        //Random generator 1
        int min = 1;
        int max = 5;
        Random ran = new Random();
        int n = ran.nextInt(max - min) + min;

        //Random generator 2
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        //String definition und umwandlung aus einem Array, dann cutten vom ersten und letzten character
        String valuesString ="";
        valuesString = Arrays.toString(arr).substring(1,valuesString.length()-1);
    }
}
