package de.pandooor.codeWars.fourKyu.nonogramSolver5x5;

public class Nonogram {
    static int gridSize = 5;
    static int[][] grid = new int[gridSize][gridSize];

    /**
     * clues[row then column][][]
     * 6   7   8   9   10
     * 1
     * 2
     * 3
     * 4
     * 5
     */

    public static int[][] solve(int[][][] clues) {
        //Setting the starting grid as 2 -> not decided
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = 2;
            }
        }

        boolean row = true;
        //Go through the clues for obvious guesses
        for (int i = 0; i < 2; i++) { //0 -> row, 1 -> column
            if (i == 0) {
                row = true;
            } else {
                row = false;
            }
            for (int j = 0; j < clues[i].length; j++) {
                for (int k = 0; k < clues[i][j].length; k++) {
                    if (clues[i][j][k] > (gridSize / 2)) {
                        solveObviousOnes(clues[i][j][k], j, row);
                    }
                }
            }
        }

        //TODO: Which rows/columns are already definit -> no more 1s allowed, or other 1s must be somewhere
        //TODO: Multiple clues can't be next to each other, always a 0 next to a finished clue
        //

        //Show progress:
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(grid[j][i] + "  ");
            }
            System.out.println();
        }
        //manually done solution for the first tipps
//        grid = new int[][]{{0, 0, 1, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 1}};
        return grid;
    }

    public static void solveObviousOnes(int x, int n, boolean row) {
        int sidesLeft = gridSize - x;
        for (int i = 0; i < gridSize; i++) {
            if (i >= sidesLeft && i < gridSize - sidesLeft) {
                if (row) { //reihe n hat tip x
                    grid[i][n] = 1;
                } else { //spalte n hat tip x
                    grid[n][i] = 1;
                }
            }
        }

    }
}
