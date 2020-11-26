import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestGenerator {
    public static void main(String[] args) {
        int numberValues = 200;
        Random ran = new Random();
        for (int x = 0; x < numberValues; x++) {
            int n = ran.nextInt(12) + 3;//ThreadLocalRandom.current().nextInt(3, 15);
            int[] arr = new int[n];
            for (int position = 0; position < n; position++) {
                arr[position] = ran.nextInt(11) - 5;
            }
            int expectedMax = MaximumSubarraySum.sequence(arr);
            String valuesString = Arrays.toString(arr);
            valuesString = Arrays.toString(arr).substring(1,valuesString.length()-1);
            String generatedName = "testExampleArray0" + x +"a";
            System.out.println("@Test");
            System.out.println("public void " + generatedName + "() throws Exception {");
            System.out.println("assertEquals(" + expectedMax + ", MaximumSubarraySumOptimized.sequence(new int[]{" + valuesString + "}));");
            System.out.println("}");
        }
    }
}
