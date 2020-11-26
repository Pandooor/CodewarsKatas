public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxSum = 0;
        for (int startValue = 0; startValue < arr.length; startValue++) {
            if (arr[startValue] <= 0) {
                continue;
            }
            for (int endValue = 0; endValue < arr.length - startValue; endValue++) {
                int currentSum = 0;
                for (int x = 0; x <= endValue; x++) {
                    currentSum += arr[startValue + x];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
