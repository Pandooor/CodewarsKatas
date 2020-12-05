package de.pandooor.codeWars.fourKyu.nonogramSolver5x5;

import de.pandooor.codeWars.eightKyu.correctMistakes.Correct;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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

        //Setting the default line to an array of 2s
        int[] startingLines = new int[gridSize];
        for (int k = 0; k < gridSize; k++) {
            startingLines[k] = 2;
        }
        //creating gridLines setup with default lines
        for (int i = 0; i < clues.length; i++) {
            for (int j = 0; j < clues[i].length; j++) {
                gridLines.add(new GridLine(clues[i][j], startingLines, j, i == 0));
            }
        }
        //setting the grid to starting lines
        for (int i = 0; i < gridLines.size(); i++) {
            gridLines.get(i).updateToGrid(grid);
        }
        //finding first hits
        for (int i = 0; i < gridLines.size(); i++) {
            if (gridLines.get(i).findObviousOnes(grid)) {
                GridLine.updateAllLines(gridLines, grid);
            }
        }
        int run = 0;
        while (true) {
            run++;
            //finding already completed lines
            for (int i = 0; i < gridLines.size(); i++) {
                if (gridLines.get(i).finished) { //skips already finished lines
                    continue;
                }
                if (gridLines.get(i).findCompletedLine(grid)) {
                    i = -1;
                    GridLine.updateAllLines(gridLines, grid);
                }
            }

            for (int i = 0; i < gridLines.size(); i++) {
                if (gridLines.get(i).finished) { //skips already finished lines
                    continue;
                }
                if (gridLines.get(i).findNeighbors(grid)) {
                    i = -1;
                    GridLine.updateAllLines(gridLines, grid);
                }
            }
            if (run > 3) {
                break; //TODO: Create conditions that checks wether grid completed?
                //TODO: Higher complexity ->guessing a number?
            }
        }

        //Show progress to debug:
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(grid[j][i] + "  ");
            }
            System.out.println();
        }
        return grid;
    }
}

class GridLine {
    int positionInGrid;
    boolean row;
    boolean finished;
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
        this.finished = false;
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

    public boolean findCompletedLine(int[][] grid) {
        boolean changedSomething = false;
        int numberOfOnes = 0;
        int numberOfOnesNeeded = 0;
        int numberOfZeros = 0;
        int numberOfTwos = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 1) {
                numberOfOnes++;
            } else if (line[i] == 0) {
                numberOfZeros++;
            }
        }
        numberOfTwos = line.length - numberOfOnes - numberOfZeros;
        for (int i = 0; i < clue.length; i++) {
            numberOfOnesNeeded += clue[i];
        }
        //all ones found -> rest must be 0s
        if (numberOfOnes == numberOfOnesNeeded) {
            for (int i = 0; i < line.length; i++) {
                if (line[i] == 2) {
                    line[i] = 0;
                    changedSomething = true;
                }
            }
        }
        //all zeros found -> rest must be 1s
        if (numberOfZeros == (line.length - numberOfOnesNeeded)) {
            for (int i = 0; i < line.length; i++) {
                if (line[i] == 2) {
                    line[i] = 1;
                    changedSomething = true;
                }
            }
        }
        if (changedSomething) {
            updateToGrid(grid);
            finished = true;
        }
        if (numberOfTwos == 0) {
            finished = true;
        }
        return changedSomething;
    }

    public boolean findNeighbors(int[][] grid) {
        boolean changedSomething = false;
        Map<Integer, Integer> sequences = new HashMap(); //key ->start of sequence, value ->length of sequence
        //TODO: implement it!
        //finding neighbors of 1s -> is also a 1 if clue needs one more and other direction is 0
        // -> or it must be 0 if clue is completed
        // -> or between two 1s must be an additional 1 if numberOfClues<current sequences
//        TODO: Correct the sequences map
        for (int i = 0; i < line.length; i++) {
            if (line[i] == 1) {
                for (int j = 1; j < line.length - i; j++) {
                    if ((i + j) < line.length && (line[i + j] != 1)) {
                        sequences.put(i, j);
                        i = i + j;
                    }
                }
            }
        }
        System.out.println("------------");
        for (int i = 0; i < sequences.size(); i++) {
            System.out.println("Key: " + i + "->" + sequences.get(i));
        }
        System.out.println("-----------");
        //TODO: hier neu machen:
        /**
         * sequences.size() == clue.length && 1s missing    -> one of the sequences neighbors
         * sequences.size() > clue.length && 1s missing     -> connect two of the sequences
         * done     sequences.size() < clue.length && 1s missing     -> need more sequences -> do nothing for now
         * if sequence finished -> neighbors must be 0
         */
        for (int z = 0; z < 3; z++) {
            //TODO: mehrere Durchläufe notwendig???
            for (int i = 0; i < line.length; i++) {
                if (sequences.size() < clue.length) {
                    break;
                }
                int n = 0;
                if (sequences.containsKey(i)) {
                    if (sequences.get(i) == clue[n]) {
                        //Länge der Sequenz == Tipp -> fertig
                        if ((i - 1) >= 0 && line[i - 1] == 2) {
                            line[i - 1] = 0;
                            changedSomething = true;
                        }
                        if ((i + sequences.get(i)) < line.length && line[i + sequences.get(i)] == 2) {
                            line[i + sequences.get(i)] = 0;
                            changedSomething = true;
                        }

                    } else {
                        if (sequences.size() > clue.length) {//Sequenzen mehr als Tipps -> verbinden
                            int x = 0;
                            while (true) {
                                if (line[i + sequences.get(i) + x] == 2) {
                                    line[i + sequences.get(i) + x] = 1;
                                } else {
                                    break;
                                }
                                x++;
                            }
                        }
                        //Länge der Sequenz < Tipp -> 1en Fehlen
                        //Sequenzen == Tipps -> Sequenz ausdehnen ohne Connecting

                    }
                    n++;
                }
            }
        }

        if (clue.length == 1) {
        } else {

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
