package de.liebig.codeWars.eightKyu.feastOfManyBeasts;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void fixedTest() {
        assertTrue(Kata.feast("great blue heron", "garlic nann"));
        assertTrue(Kata.feast("chickadee", "chocolate cake"));
        assertFalse(Kata.feast("brown bear", "bear claw"));
    }
}