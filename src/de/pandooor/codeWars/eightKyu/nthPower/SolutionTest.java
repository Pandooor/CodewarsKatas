package de.pandooor.codeWars.eightKyu.nthPower;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(-1, Kata.nthPower(new int[]{1, 2}, 2));
        assertEquals(8, Kata.nthPower(new int[]{3, 1, 2, 2}, 3));
        assertEquals(4, Kata.nthPower(new int[]{3, 1, 2}, 2));
    }
}