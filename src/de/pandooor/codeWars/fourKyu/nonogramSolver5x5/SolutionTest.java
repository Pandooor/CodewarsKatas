package de.pandooor.codeWars.fourKyu.nonogramSolver5x5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void sampleCases() {
        int[][][][] clues = new int[][][][]{
                {{{1, 1}, {4}, {1, 1, 1}, {3}, {1}},
                        {{1}, {2}, {3}, {2, 1}, {4}}},
                {{{1}, {3}, {1}, {3, 1}, {3, 1}},
                        {{3}, {2}, {2, 2}, {1}, {1, 2}}},
                {{{2}, {3}, {4}, {1, 1}, {1, 1}},
                        {{2}, {3, 1}, {3}, {1, 1}, {2}}}};

        int[][][] answers = new int[][][]{
                {{0, 0, 1, 0, 0},
                        {1, 1, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 1, 0, 1, 0},
                        {0, 1, 1, 1, 1}},
                {{0, 0, 1, 1, 1},
                        {0, 0, 0, 1, 1},
                        {1, 1, 0, 1, 1},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 1, 1}},
                {{1, 1, 0, 0, 0},
                        {1, 1, 1, 0, 1},
                        {0, 1, 1, 1, 0},
                        {0, 0, 1, 0, 1},
                        {0, 0, 1, 1, 0}}};

        assertEquals(answers[0], Nonogram.solve(clues[0]));
        System.out.println("First Done.");
        assertEquals(answers[1], Nonogram.solve(clues[1]));
        System.out.println("Second Done.");
        assertEquals(answers[2], Nonogram.solve(clues[2]));
    }
}
