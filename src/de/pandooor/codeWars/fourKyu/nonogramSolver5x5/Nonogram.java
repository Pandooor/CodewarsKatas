package de.pandooor.codeWars.fourKyu.nonogramSolver5x5;

import java.util.LinkedList;

public class Nonogram {
    static int gridSize;
    static int[][] grid;
    static LinkedList<GridLine> gridLines;

    /**
     * clues[row then column][][]
     * --- 6   7   8   9   10
     * 1
     * 2
     * 3
     * 4
     * 5
     */

    public static int[][] solve(int[][][] clues) {
        gridSize = clues[0].length;
        grid = new int[gridSize][gridSize];
        gridLines = new LinkedList<>();
        boolean row;
        //setting all values as undecided
        int[] startingLines = new int[gridSize]; //Setting the starting grid as 2 -> not decided
        for (int k = 0; k < gridSize; k++) {
            startingLines[k] = 2;
        }
        for (int i = 0; i < clues.length; i++) {
            for (int j = 0; j < clues[i].length; j++) {
                gridLines.add(new GridLine(clues[i][j], startingLines, j, i == 0));
            }
        }
        //updating the grid
        for (int i = 0; i < gridLines.size(); i++) {
            gridLines.get(i).updateToGrid(grid);
        }

        //finding first finds
        for (int i = 0; i < gridLines.size(); i++) {
            if (gridLines.get(i).findObviousOnes(grid)) {
                GridLine.updateAllLines(gridLines, grid);
            }
        }
        //TODO: Continue with already enough filled lines:
        //TODO: Which rows/columns are already definit -> no more 1s allowed, or other 1s must be somewhere

        //TODO: Multiple clues can't be next to each other, always a 0 next to a finished clue

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
}

class GridLine {
    int positionInGrid;
    boolean row;
    int[] clue;
    int[] line;

    public GridLine(int[] clue, int[] line, int positionInGrid, boolean row) {
        this.clue = new int[clue.length];
        for (int i = 0; i < clue.length; i++) {
            this.clue[i] = clue[i];
        }
        this.line = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            this.line[i] = line[i];
        }
        this.positionInGrid = positionInGrid;
        this.row = row;
    }

    public void updateFromGrid(int[][] grid) {
        for (int i = 0; i < line.length; i++) {
            if (row) {
                line[i] = grid[i][positionInGrid];
            } else {
                line[i] = grid[positionInGrid][i];
            }
        }
    }

    public void updateToGrid(int[][] grid) {
        for (int i = 0; i < line.length; i++) {
            if (row) {
                grid[i][positionInGrid] = line[i];
            } else {
                grid[positionInGrid][i] = line[i];
            }
        }
    }

    public boolean findObviousOnes(int[][] grid) {
        int sumOfOnes = 0;
        boolean changedSomething = false;
        for (int i = 0; i < clue.length; i++) { //finds the middle must be ones
            sumOfOnes += clue[i];
            if (clue[i] > (line.length / 2)) {
                int sidesLeft = line.length - clue[i];
                for (int j = 0; j < line.length; j++) {
                    if (j >= sidesLeft && j < line.length - sidesLeft) {
                        line[j] = 1;
                        changedSomething = true;
                    }
                }
            }
        }
        if ((sumOfOnes + clue.length - 1) == line.length) {
            line[0] = 1;
            line[line.length - 1] = 1;
            changedSomething = true;
        }
        if (changedSomething) {
            updateToGrid(grid);
        }
        return changedSomething;
    }

    public static void updateAllLines(LinkedList<GridLine> gridLines, int[][] grid) {
        for (int i = 0; i < gridLines.size(); i++) {
            gridLines.get(i).updateFromGrid(grid);
        }
    }
}
