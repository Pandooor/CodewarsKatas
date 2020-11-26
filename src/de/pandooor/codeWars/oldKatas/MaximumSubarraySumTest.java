package de.pandooor.codeWars.oldKatas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumSubarraySumTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaximumSubarraySum.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals( 6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    @Test
    public void test2EmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaximumSubarraySumOptimized.sequence(new int[]{}));
    }
    @Test
    public void test2ExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaximumSubarraySumOptimized.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    //automaticly generated

    @Test
    public void testExampleArray00a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{2, 5, -1, -4, 2, 2, 2, -1}));
    }
    @Test
    public void testExampleArray01a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{5, 0, 4, 1, -5}));
    }
    @Test
    public void testExampleArray02a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{-5, 0, 3, -1, 4, -4, -2, -1}));
    }
    @Test
    public void testExampleArray03a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{-5, -4, -1, 0, -2, -3, 4, 3, -4, -5}));
    }
    @Test
    public void testExampleArray04a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{5, 3, 0, -2, -2, 4, -3, -4, 1, -2, -2, 5}));
    }
    @Test
    public void testExampleArray05a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{-5, -5, 1, 1, 0}));
    }
    @Test
    public void testExampleArray06a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{-5, 1, 4, 3, -1, 4, -2, -5}));
    }
    @Test
    public void testExampleArray07a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{-2, 0, 2, -1, 2, -5, 5, 5, -5, 4, 2, 0, 0}));
    }
    @Test
    public void testExampleArray08a() throws Exception {
        assertEquals(29, MaximumSubarraySumOptimized.sequence(new int[]{-2, 4, -4, 5, 1, 5, 3, -5, 3, 2, 4, 3, 5, 3}));
    }
    @Test
    public void testExampleArray09a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -5, -4, -3}));
    }
    @Test
    public void testExampleArray010a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{-5, 2, -2, 0, -3, 0, -4, 3, -1, 1, 0, -3}));
    }
    @Test
    public void testExampleArray011a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-4, 5, -3, 0}));
    }
    @Test
    public void testExampleArray012a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{1, 1, -5, 0, 0, 4, -4}));
    }
    @Test
    public void testExampleArray013a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{0, 0, 2, -5, -1}));
    }
    @Test
    public void testExampleArray014a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-2, -5, 2, -5, -2, 5, 0, -4, 1, -4}));
    }
    @Test
    public void testExampleArray015a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{0, -2, -1, 3, -3, 4, 5, 0}));
    }
    @Test
    public void testExampleArray016a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{3, 5, -3, 2, 4, -5}));
    }
    @Test
    public void testExampleArray017a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{0, 1, 1, 3, -4, 0}));
    }
    @Test
    public void testExampleArray018a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{2, -2, -4, -3, -4, 2}));
    }
    @Test
    public void testExampleArray019a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{0, -3, 4, -4, -5, -3, 4, -2, 5, 4}));
    }
    @Test
    public void testExampleArray020a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{3, -4, 0}));
    }
    @Test
    public void testExampleArray021a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{4, -3, 0, 3, 2, -2, 5, -5, -3, -5, -3, 5}));
    }
    @Test
    public void testExampleArray022a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{3, 2, -4, -3, 3, -3, 3, 5, 0, -5, 5, 1, 2}));
    }
    @Test
    public void testExampleArray023a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{0, 3, 4}));
    }
    @Test
    public void testExampleArray024a() throws Exception {
        assertEquals(16, MaximumSubarraySumOptimized.sequence(new int[]{3, -5, 0, 4, 0, 3, 5, -1, -1, 3, 1, 2, -4}));
    }
    @Test
    public void testExampleArray025a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{1, -4, -4, 4, 0, 3, -1, -2, 5}));
    }
    @Test
    public void testExampleArray026a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -4, 2, -5, 4}));
    }
    @Test
    public void testExampleArray027a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{4, 4, 3, 4, 0, -3, -5, -5}));
    }
    @Test
    public void testExampleArray028a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{0, 5, -5, 1, -5, 2}));
    }
    @Test
    public void testExampleArray029a() throws Exception {
        assertEquals(1, MaximumSubarraySumOptimized.sequence(new int[]{-3, 1, -4}));
    }
    @Test
    public void testExampleArray030a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{2, 1, 2, -2, 3, 0, 4, -3, -5}));
    }
    @Test
    public void testExampleArray031a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{3, 2, 0, -5, -1, 1, -3, -1, 5, -3, 0, 2, 4}));
    }
    @Test
    public void testExampleArray032a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{-4, 3, -1, 4, -4}));
    }
    @Test
    public void testExampleArray033a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{0, 0, 4, 4, -1, 3, 1}));
    }
    @Test
    public void testExampleArray034a() throws Exception {
        assertEquals(21, MaximumSubarraySumOptimized.sequence(new int[]{-5, 0, 0, 3, 2, -1, 1, 3, 2, 4, 2, 5, -3}));
    }
    @Test
    public void testExampleArray035a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{2, 4, -4, -1}));
    }
    @Test
    public void testExampleArray036a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-4, 1, 3, 4, 3, -5, 1, 0, 5, -5, 1, -4, 2, 2}));
    }
    @Test
    public void testExampleArray037a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{-2, -1, -1, -2, 3, 4, 3}));
    }
    @Test
    public void testExampleArray038a() throws Exception {
        assertEquals(0, MaximumSubarraySumOptimized.sequence(new int[]{-1, -5, -2, -3}));
    }
    @Test
    public void testExampleArray039a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-1, -2, 0, -4, 2, -3, 3, 3, 2, 4}));
    }
    @Test
    public void testExampleArray040a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{2, 4, 0, -1, 5}));
    }
    @Test
    public void testExampleArray041a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{5, 4, -4}));
    }
    @Test
    public void testExampleArray042a() throws Exception {
        assertEquals(19, MaximumSubarraySumOptimized.sequence(new int[]{-1, -5, 4, 2, 3, 5, 3, 0, -1, 3}));
    }
    @Test
    public void testExampleArray043a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-5, 3, -3, 5, 4, -3, 0, 0}));
    }
    @Test
    public void testExampleArray044a() throws Exception {
        assertEquals(13, MaximumSubarraySumOptimized.sequence(new int[]{0, 5, -2, 2, 1, -5, -1, -1, 5, 0, 3, 2, 0, 3}));
    }
    @Test
    public void testExampleArray045a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{0, -1, 4, -5, -4, -2, -2, -1, -5, 0, 1}));
    }
    @Test
    public void testExampleArray046a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{4, 4, -3, -3, -4, 5}));
    }
    @Test
    public void testExampleArray047a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{-5, 4, -2, -5, 1, 3, 3, -2, 5, -4}));
    }
    @Test
    public void testExampleArray048a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{0, -3, 3, -3, -1, -4, 3, -2}));
    }
    @Test
    public void testExampleArray049a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{3, 1, 2, 0, 3, 1, 0, -4, 2, -4}));
    }
    @Test
    public void testExampleArray050a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-2, -3, -2, 4, 4, 4, -3, -3, -3, -3, 2}));
    }
    @Test
    public void testExampleArray051a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{0, -2, -4, 4}));
    }
    @Test
    public void testExampleArray052a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -4, -3, 3, -3, -4}));
    }
    @Test
    public void testExampleArray053a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-4, -4, -1, 0, -1, 5, -5, -5, 0, -3, 0, -1, 3, 1}));
    }
    @Test
    public void testExampleArray054a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{0, -3, 3, 4, 3, -1}));
    }
    @Test
    public void testExampleArray055a() throws Exception {
        assertEquals(13, MaximumSubarraySumOptimized.sequence(new int[]{1, -3, -3, -1, 5, 0, 5, 0, 3, -3, 1}));
    }
    @Test
    public void testExampleArray056a() throws Exception {
        assertEquals(1, MaximumSubarraySumOptimized.sequence(new int[]{-4, 0, -1, 1, 0}));
    }
    @Test
    public void testExampleArray057a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-2, -1, -1, 1, -3, 3, -3, 4, 5, 1, 2}));
    }
    @Test
    public void testExampleArray058a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{5, -3, 2, 4, 0, -3, -4, -5, 4}));
    }
    @Test
    public void testExampleArray059a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{5, -3, -5, 3, 4, 5, -3}));
    }
    @Test
    public void testExampleArray060a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{4, 3, -5, 3, 5, 1, 0, -3}));
    }
    @Test
    public void testExampleArray061a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{5, 0, 4}));
    }
    @Test
    public void testExampleArray062a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{-2, -5, 4, -2, -3, -5, -3}));
    }
    @Test
    public void testExampleArray063a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{2, 3, -4, -4, -3, 1, 0, 0, 3, 4}));
    }
    @Test
    public void testExampleArray064a() throws Exception {
        assertEquals(1, MaximumSubarraySumOptimized.sequence(new int[]{1, -4, -2, -5, -3, 0, 1}));
    }
    @Test
    public void testExampleArray065a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{4, -2, 0, 5, 3, 4, 1}));
    }
    @Test
    public void testExampleArray066a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{-4, -2, 4, 4, -1, -5, -1}));
    }
    @Test
    public void testExampleArray067a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{1, -2, 4, 0}));
    }
    @Test
    public void testExampleArray068a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-1, -2, 3, -5, 5, -3, -5, 4, -2}));
    }
    @Test
    public void testExampleArray069a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-3, 5, -3, 1, -4, -4, -5, 0, 5, 4, -4, -1, 5, -2}));
    }
    @Test
    public void testExampleArray070a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{-1, -4, -1, 2, 1, -5}));
    }
    @Test
    public void testExampleArray071a() throws Exception {
        assertEquals(0, MaximumSubarraySumOptimized.sequence(new int[]{-5, -5, 0, -5, -5, -2, -1, -1}));
    }
    @Test
    public void testExampleArray072a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{2, -1, -2, 3, -5, 2, 2, 0, 2, 3, -5, 3, 5, 0}));
    }
    @Test
    public void testExampleArray073a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{1, -2, -5, 3, -1, -3, 5, -2, -2, 1, 4, -4}));
    }
    @Test
    public void testExampleArray074a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-1, -4, -5, 2, -2, 4, 4, 1, 3}));
    }
    @Test
    public void testExampleArray075a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{-2, -1, -3, 2, 1, 5, -2, -4, 2, -2, -3, -4, -2, 2}));
    }
    @Test
    public void testExampleArray076a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{-5, -3, 1, -4, -1, -3, 4, -2, 2, -1, 1, 3, 3}));
    }
    @Test
    public void testExampleArray077a() throws Exception {
        assertEquals(14, MaximumSubarraySumOptimized.sequence(new int[]{5, 1, 3, 5, 0, -3, -2}));
    }
    @Test
    public void testExampleArray078a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -3, -1, 0, 2, -1, 3, -5, -5, 5}));
    }
    @Test
    public void testExampleArray079a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{2, 4, -3, -1, -5, 1, 2, 4, 1, -1, -2}));
    }
    @Test
    public void testExampleArray080a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{1, -4, 4, 1, -5, 5, -3, 2, -4, 2, 5, 3}));
    }
    @Test
    public void testExampleArray081a() throws Exception {
        assertEquals(0, MaximumSubarraySumOptimized.sequence(new int[]{0, 0, -2}));
    }
    @Test
    public void testExampleArray082a() throws Exception {
        assertEquals(0, MaximumSubarraySumOptimized.sequence(new int[]{-3, -1, -5}));
    }
    @Test
    public void testExampleArray083a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-5, 5, -5, -2, 3, 2, 0, 3, 1}));
    }
    @Test
    public void testExampleArray084a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{2, 0, -3, 1, 5, 5, 4, -2, 2, -4, -4}));
    }
    @Test
    public void testExampleArray085a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{1, -2, 3, 5, -2}));
    }
    @Test
    public void testExampleArray086a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{2, -3, -2, -1, 3, 4, 0, -2, 3}));
    }
    @Test
    public void testExampleArray087a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-3, 5, 4}));
    }
    @Test
    public void testExampleArray088a() throws Exception {
        assertEquals(13, MaximumSubarraySumOptimized.sequence(new int[]{4, 5, 0, -2, -4, 2, -2, -2, 3, 2, 5, 2}));
    }
    @Test
    public void testExampleArray089a() throws Exception {
        assertEquals(20, MaximumSubarraySumOptimized.sequence(new int[]{2, -3, 4, -3, 0, 2, 5, 2, 5, 3, 0, 2, -5}));
    }
    @Test
    public void testExampleArray090a() throws Exception {
        assertEquals(1, MaximumSubarraySumOptimized.sequence(new int[]{-5, -5, -4, -2, 1}));
    }
    @Test
    public void testExampleArray091a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{-2, -3, 0, 2, 1, 5, -3, -5, 3, 4, 0, -3}));
    }
    @Test
    public void testExampleArray092a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{0, 5, 0, -1, 1, -4, 0}));
    }
    @Test
    public void testExampleArray093a() throws Exception {
        assertEquals(17, MaximumSubarraySumOptimized.sequence(new int[]{-5, -4, 4, -2, 2, 3, 0, -1, 1, 5, 5}));
    }
    @Test
    public void testExampleArray094a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-3, -2, -1, -1, 2, 2, 1, 3, 4, -1, -2}));
    }
    @Test
    public void testExampleArray095a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{-1, -3, -5, -3, -4, 3, 4, -4, -5, -5, -5}));
    }
    @Test
    public void testExampleArray096a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-2, 4, -3, 4, -2, 0}));
    }
    @Test
    public void testExampleArray097a() throws Exception {
        assertEquals(16, MaximumSubarraySumOptimized.sequence(new int[]{4, 4, 4, 3, 1, -3, -3, 4, -3}));
    }
    @Test
    public void testExampleArray098a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{-3, 2, -4, 1}));
    }
    @Test
    public void testExampleArray099a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{-4, -3, -2, 0, 1, -2, -2, -2, 2, 2, -2}));
    }
    @Test
    public void testExampleArray0100a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{0, -1, -1, -5, -5, -1, -5, -2, -1, 0, -1, -5, 4}));
    }
    @Test
    public void testExampleArray0101a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-1, 4, 1, 5, 2, -2, -4, -1, 2, -2, 5, -1}));
    }
    @Test
    public void testExampleArray0102a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{-1, 2, 2, 0, 0, 2, 0, -5, 1, 2, -3, -3, -2, 4}));
    }
    @Test
    public void testExampleArray0103a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-2, 4, -1, -4, 0, 2, -2, 4, 4, 4, -4, -3, -5, 3}));
    }
    @Test
    public void testExampleArray0104a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{1, -5, -5, -4, -4, -1, 3, 1, -3, -2}));
    }
    @Test
    public void testExampleArray0105a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{2, 5, 2}));
    }
    @Test
    public void testExampleArray0106a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{4, -4, -5, 3, -3, -2, -5, -4, 4, -1, -5, -3, -1}));
    }
    @Test
    public void testExampleArray0107a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{0, 1, 1}));
    }
    @Test
    public void testExampleArray0108a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-3, 5, -1, -1, -2}));
    }
    @Test
    public void testExampleArray0109a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{1, -4, -3, -5, -2, -3, -5, -4, -4, 2, 1, 3, 3}));
    }
    @Test
    public void testExampleArray0110a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{-5, 4, 3, -5, -4, -1, -1, -3, 4, -2}));
    }
    @Test
    public void testExampleArray0111a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{5, -5, 3, -2, 4, 1, -4, 1}));
    }
    @Test
    public void testExampleArray0112a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{-4, 2, -4, -4, 3, -5}));
    }
    @Test
    public void testExampleArray0113a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{-2, -2, -5, -4, 2, 1, -2}));
    }
    @Test
    public void testExampleArray0114a() throws Exception {
        assertEquals(14, MaximumSubarraySumOptimized.sequence(new int[]{2, 5, 1, -5, 1, 5, 2, 1, 2, -5}));
    }
    @Test
    public void testExampleArray0115a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -2, 1, -3, -3, 4, 1, -1, 1, -4, 2, -2}));
    }
    @Test
    public void testExampleArray0116a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{0, -1, -3, -2, 1, -4, 3, -5, -5, 3, -5, 0}));
    }
    @Test
    public void testExampleArray0117a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{1, 4, 3, -3, -1, 2, -1, -5, 3, -3}));
    }
    @Test
    public void testExampleArray0118a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{3, 1, -4, -3, -5, 5, 1, -5}));
    }
    @Test
    public void testExampleArray0119a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{-2, 5, -5, -1, 2, 1, 3, -2, -5}));
    }
    @Test
    public void testExampleArray0120a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{0, 5, -2}));
    }
    @Test
    public void testExampleArray0121a() throws Exception {
        assertEquals(13, MaximumSubarraySumOptimized.sequence(new int[]{2, -5, 3, -4, 1, 3, 0, 4, 5}));
    }
    @Test
    public void testExampleArray0122a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{3, -4, -1, 3, -3, 4, 1}));
    }
    @Test
    public void testExampleArray0123a() throws Exception {
        assertEquals(13, MaximumSubarraySumOptimized.sequence(new int[]{-4, 2, 1, 3, 0, 0, -4, 1, 5, 5, -4}));
    }
    @Test
    public void testExampleArray0124a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{0, 4, 4, 2, 1, -2, -1, -2, 0, 0}));
    }
    @Test
    public void testExampleArray0125a() throws Exception {
        assertEquals(14, MaximumSubarraySumOptimized.sequence(new int[]{3, -1, -1, 5, 3, 5, -3}));
    }
    @Test
    public void testExampleArray0126a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{3, -1, 4, -2, 3}));
    }
    @Test
    public void testExampleArray0127a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{1, -1, 2, 2, 2, 1, -5, -2, -4, -5, -2, -2, 4}));
    }
    @Test
    public void testExampleArray0128a() throws Exception {
        assertEquals(18, MaximumSubarraySumOptimized.sequence(new int[]{-1, -5, 0, -3, -1, 3, 5, 2, 5, -3, 3, 2, 1}));
    }
    @Test
    public void testExampleArray0129a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{0, -2, -5, -1, -4, 1, 3}));
    }
    @Test
    public void testExampleArray0130a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{4, -1, -4}));
    }
    @Test
    public void testExampleArray0131a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{-2, -1, 1, 4, -5, -5, -2, -3, -1, -1, -5, 3, -2}));
    }
    @Test
    public void testExampleArray0132a() throws Exception {
        assertEquals(26, MaximumSubarraySumOptimized.sequence(new int[]{-1, 3, -5, 3, 1, 4, -4, 5, 5, 4, 2, 4, 2}));
    }
    @Test
    public void testExampleArray0133a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-2, -5, -2, 2, -2, 5, 3, 2, 1, 1}));
    }
    @Test
    public void testExampleArray0134a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{-2, -2, 2, -1}));
    }
    @Test
    public void testExampleArray0135a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{-2, -1, 2, 4, -1, -4, -2, 2, -3, 1, 0, -5, -1}));
    }
    @Test
    public void testExampleArray0136a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{0, 4, -1, 5, -1}));
    }
    @Test
    public void testExampleArray0137a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{1, -5, -3, 4, -4, -4}));
    }
    @Test
    public void testExampleArray0138a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{3, -3, -2}));
    }
    @Test
    public void testExampleArray0139a() throws Exception {
        assertEquals(25, MaximumSubarraySumOptimized.sequence(new int[]{5, 4, -3, 4, 4, -2, 0, 4, -1, 5, 1, 4, 0}));
    }
    @Test
    public void testExampleArray0140a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{2, 1, 1, 0, -3, -1}));
    }
    @Test
    public void testExampleArray0141a() throws Exception {
        assertEquals(18, MaximumSubarraySumOptimized.sequence(new int[]{-4, -3, 1, -5, 3, 5, 5, 4, 1, -1, -5}));
    }
    @Test
    public void testExampleArray0142a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{0, -1, 1, -4, 0, -5, -3, 2, -3}));
    }
    @Test
    public void testExampleArray0143a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{1, 2, -1}));
    }
    @Test
    public void testExampleArray0144a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{1, 0, 4, 0, 0, -1, 2, 3, -5, 2, -2, 3, 4}));
    }
    @Test
    public void testExampleArray0145a() throws Exception {
        assertEquals(13, MaximumSubarraySumOptimized.sequence(new int[]{-2, 1, 4, 1, 0, -1, -2, -2, 2, 5, 5, 0}));
    }
    @Test
    public void testExampleArray0146a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{4, 1, -1, 0, 3, -4, 3, -5, -5, -3}));
    }
    @Test
    public void testExampleArray0147a() throws Exception {
        assertEquals(0, MaximumSubarraySumOptimized.sequence(new int[]{0, -3, -3, -4, -4, -1}));
    }
    @Test
    public void testExampleArray0148a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{5, 1, 3, 0, -2, 5, -1, -3, -5, 0, 1, 0, 1, 1}));
    }
    @Test
    public void testExampleArray0149a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{3, 4, 1}));
    }
    @Test
    public void testExampleArray0150a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -2, -2, -2, 2, -3}));
    }
    @Test
    public void testExampleArray0151a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{5, -2, -2, 1, 3, 3, -4, -2}));
    }
    @Test
    public void testExampleArray0152a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{2, -3, 0, 0, 1, -5, -5, 2, 3, -5, 3}));
    }
    @Test
    public void testExampleArray0153a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{4, -2, -2, -2, 3, -4, -5, 3, 0}));
    }
    @Test
    public void testExampleArray0154a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{5, 5, 1, 3, -5, 1, -4, 3, -1, 2, 4, 1}));
    }
    @Test
    public void testExampleArray0155a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, 0, -1, -2}));
    }
    @Test
    public void testExampleArray0156a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{-1, 4, -1, 1, 1, -3, 4, -3, 4}));
    }
    @Test
    public void testExampleArray0157a() throws Exception {
        assertEquals(17, MaximumSubarraySumOptimized.sequence(new int[]{0, -1, -3, 0, -1, 3, -2, 3, 5, 4, -1, 5}));
    }
    @Test
    public void testExampleArray0158a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{-4, -2, 4}));
    }
    @Test
    public void testExampleArray0159a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{-4, 4, 5, 0, 4, 2, 0}));
    }
    @Test
    public void testExampleArray0160a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{-5, 5, -2, 3, 3, 2}));
    }
    @Test
    public void testExampleArray0161a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{3, 3, 1, 1, 2, -3, -2, -2, 1, 3}));
    }
    @Test
    public void testExampleArray0162a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{0, 0, 3, 3, 4, -5, 4, 3}));
    }
    @Test
    public void testExampleArray0163a() throws Exception {
        assertEquals(18, MaximumSubarraySumOptimized.sequence(new int[]{1, 0, 4, 4, -2, -4, 5, 3, -2, -2, 5, 5, 1, 0}));
    }
    @Test
    public void testExampleArray0164a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{2, -4, 1}));
    }
    @Test
    public void testExampleArray0165a() throws Exception {
        assertEquals(17, MaximumSubarraySumOptimized.sequence(new int[]{2, -2, 5, -2, 1, -3, -1, 0, 5, 4, 3, 5}));
    }
    @Test
    public void testExampleArray0166a() throws Exception {
        assertEquals(0, MaximumSubarraySumOptimized.sequence(new int[]{0, 0, -3, -1}));
    }
    @Test
    public void testExampleArray0167a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{-3, 2, -3, 3}));
    }
    @Test
    public void testExampleArray0168a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{-1, -2, 2, 2, 5, 3, 0, 0, 3, -5}));
    }
    @Test
    public void testExampleArray0169a() throws Exception {
        assertEquals(18, MaximumSubarraySumOptimized.sequence(new int[]{-4, 3, 5, -1, -2, 0, 4, 3, 4, -4, -1, 2, 0, 5}));
    }
    @Test
    public void testExampleArray0170a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{1, 4, -2, 5}));
    }
    @Test
    public void testExampleArray0171a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{0, -1, 4, 5, -2, 2}));
    }
    @Test
    public void testExampleArray0172a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{-1, 5, 3, -4, 3, -2, -5, -5, -5, 5, -3, 3, -4, 5}));
    }
    @Test
    public void testExampleArray0173a() throws Exception {
        assertEquals(10, MaximumSubarraySumOptimized.sequence(new int[]{5, 5, -2, 2, -4}));
    }
    @Test
    public void testExampleArray0174a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{0, -2, -1, 4, -2, 2, -3}));
    }
    @Test
    public void testExampleArray0175a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{-4, 1, -5, -4, 1, 1, -2, 1, -3, 1, -2, -5}));
    }
    @Test
    public void testExampleArray0176a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-3, 4, -1, 1, -2, 1, 5, -3, 4}));
    }
    @Test
    public void testExampleArray0177a() throws Exception {
        assertEquals(17, MaximumSubarraySumOptimized.sequence(new int[]{5, -1, 5, 4, -3, -1, 2, -2, 4, 0, 4}));
    }
    @Test
    public void testExampleArray0178a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-1, 0, 0, 1, 3, 2, 3, -5, 5}));
    }
    @Test
    public void testExampleArray0179a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -5, -5, -4}));
    }
    @Test
    public void testExampleArray0180a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-4, 5, -4, 5, 2, 4, -2, -2}));
    }
    @Test
    public void testExampleArray0181a() throws Exception {
        assertEquals(23, MaximumSubarraySumOptimized.sequence(new int[]{-3, -2, 0, 4, -2, 2, 5, 5, 2, 5, 2, -2}));
    }
    @Test
    public void testExampleArray0182a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{5, -1, -2, -5, -2, 2, -1, -2, -4, -4}));
    }
    @Test
    public void testExampleArray0183a() throws Exception {
        assertEquals(11, MaximumSubarraySumOptimized.sequence(new int[]{5, 4, 0, 2, -3, -4, -3, 2, 1, -5, 1, 5, 4}));
    }
    @Test
    public void testExampleArray0184a() throws Exception {
        assertEquals(2, MaximumSubarraySumOptimized.sequence(new int[]{-5, -4, 0, -3, -3, -2, 0, -2, 2, -1}));
    }
    @Test
    public void testExampleArray0185a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{3, 1, -5, -5, 3, 3}));
    }
    @Test
    public void testExampleArray0186a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{2, 3, -1, 1, 2, -5, 1, 0}));
    }
    @Test
    public void testExampleArray0187a() throws Exception {
        assertEquals(12, MaximumSubarraySumOptimized.sequence(new int[]{-5, 4, 4, 4, -4, -4, 0, 1, -3, 2, 3, 2}));
    }
    @Test
    public void testExampleArray0188a() throws Exception {
        assertEquals(15, MaximumSubarraySumOptimized.sequence(new int[]{-4, 0, 3, 5, 3, 4}));
    }
    @Test
    public void testExampleArray0189a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{4, 0, 0, 0, -2, 1, -5, 5}));
    }
    @Test
    public void testExampleArray0190a() throws Exception {
        assertEquals(4, MaximumSubarraySumOptimized.sequence(new int[]{-5, -4, 3, -3, -2, 0, -2, 4, -3, -3, 2, -5, 3, -2}));
    }
    @Test
    public void testExampleArray0191a() throws Exception {
        assertEquals(7, MaximumSubarraySumOptimized.sequence(new int[]{1, -4, 3, 4, -5, -1, 4, -4, -1, -5, 4, -1}));
    }
    @Test
    public void testExampleArray0192a() throws Exception {
        assertEquals(9, MaximumSubarraySumOptimized.sequence(new int[]{-4, 5, -2, 2, 1, 3, -3, 2}));
    }
    @Test
    public void testExampleArray0193a() throws Exception {
        assertEquals(6, MaximumSubarraySumOptimized.sequence(new int[]{3, -3, -1, 1, 4, -4, 2, 1, -2, -3, -5, 4, 2}));
    }
    @Test
    public void testExampleArray0194a() throws Exception {
        assertEquals(5, MaximumSubarraySumOptimized.sequence(new int[]{1, -3, -3, 1, 3, -1, 0, 2, 0, -1, -2, 0}));
    }
    @Test
    public void testExampleArray0195a() throws Exception {
        assertEquals(3, MaximumSubarraySumOptimized.sequence(new int[]{-5, 3, 0, 0}));
    }
    @Test
    public void testExampleArray0196a() throws Exception {
        assertEquals(14, MaximumSubarraySumOptimized.sequence(new int[]{-2, -2, 3, 2, 4, -5, 5, 5}));
    }
    @Test
    public void testExampleArray0197a() throws Exception {
        assertEquals(14, MaximumSubarraySumOptimized.sequence(new int[]{-4, 5, 0, 4, 5}));
    }
    @Test
    public void testExampleArray0198a() throws Exception {
        assertEquals(17, MaximumSubarraySumOptimized.sequence(new int[]{4, 0, -2, -4, -4, 4, 5, -4, 2, -1, 5, 1, 5}));
    }
    @Test
    public void testExampleArray0199a() throws Exception {
        assertEquals(8, MaximumSubarraySumOptimized.sequence(new int[]{2, 2, -2, 1, 5, -4, 2, -2, -5, 5, -5, 5, -1}));
    }
}
