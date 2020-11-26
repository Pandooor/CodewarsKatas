package de.pandooor.codeWars.fourKyu.chessFun8AmazonCheckmate;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SolutionTest {
    @Test
    public void testBasic() {
        assertArrayEquals(new int[]{0, 29, 1, 29}, AmazonCheckmate.amazonCheckmate("a1", "g5"));
        assertArrayEquals(new int[]{1, 32, 1, 23}, AmazonCheckmate.amazonCheckmate("a3", "e4"));
        assertArrayEquals(new int[]{6, 11, 0, 38}, AmazonCheckmate.amazonCheckmate("f3", "f2"));
        assertArrayEquals(new int[]{0, 10, 0, 45}, AmazonCheckmate.amazonCheckmate("b7", "a8"));
        assertArrayEquals(new int[]{4, 28, 1, 21}, AmazonCheckmate.amazonCheckmate("f7", "d3"));
        assertArrayEquals(new int[]{9, 21, 0, 24}, AmazonCheckmate.amazonCheckmate("g2", "c3"));
        assertArrayEquals(new int[]{4, 18, 0, 32}, AmazonCheckmate.amazonCheckmate("f3", "c1"));
        assertArrayEquals(new int[]{0, 18, 0, 36}, AmazonCheckmate.amazonCheckmate("d4", "h8"));
    }
}