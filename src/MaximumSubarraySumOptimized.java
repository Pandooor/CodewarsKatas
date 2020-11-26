public class MaximumSubarraySumOptimized {
    public static int sequence(int[] arr) {
        int max_ending_here = 0, max_so_far = 0;
        for (int value : arr) {
            max_ending_here = Math.max(0, max_ending_here + value);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}

//v wird zu allen Zahlen im array in jeder Iteration die nächste
//max_ending_here wird zum maximum aus 0 und dem aktuellen eigenen Wert + der aktuellen Zahl
//max_so_far wird zu dem maximum aus dem aktuellen max_so_far und dem aktuellen max_ending_here
//Damit im Test:
//v = -2; max_ending_here = 0; max_so_far = 0;
//v = 1; max_ending_here = 1; max_so_far = 1;
//v = -3; max_ending_here = 0; max_so_far = 1;
//v = 4; max_ending_here = 4; max_so_far = 4;
//v = -1; max_ending_here = 3; max_so_far = 4;
//v = 2; max_ending_here = 5; max_so_far = 5;
//v = 1; max_ending_here = 6; max_so_far = 6;
//v = -5; max_ending_here = 1; max_so_far = 6;
//v = -4; max_ending_here = 0; max_so_far = 6;

//wieso funktioniert es so einfach, negative Werte durch 0 zu ersetzen?
//tritt ein negativer Wert auf, ist es automatisch besser nach diesem Wert eine neue Kette zu starten?
//immer so? JA! Genial einfach nur die Streaks zu betrachten


