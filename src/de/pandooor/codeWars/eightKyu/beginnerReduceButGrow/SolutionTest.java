package de.pandooor.codeWars.eightKyu.beginnerReduceButGrow;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(6, Kata.grow(new int[]{1,2,3}));
        assertEquals(16, Kata.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Kata.grow(new int[]{2,2,2,2,2,2}));
    }
}