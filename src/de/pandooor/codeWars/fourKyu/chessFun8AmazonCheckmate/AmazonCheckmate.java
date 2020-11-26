package de.pandooor.codeWars.fourKyu.chessFun8AmazonCheckmate;

import java.util.Arrays;

public class AmazonCheckmate {
    public static int[] answer;
    public static int[][] board;
    public static boolean amazonIsGuarded;
    public static int[][] debugBoard;

    public static int[] amazonCheckmate(String king, String amazon) {
        answer = new int[4];
        board = new int[8][8];
        amazonIsGuarded = false;
        debugBoard = new int[8][8];
        //9 is the King
        //8 is the guarded Area by the King
        //7 is the amazon
        //6 is the area the amazon is atacking
        //0 is the save area
        //1 is checkmate
        //2 is check with escape
        //3 is stalemate
        //4 is safe with escape

        char[] kingPosition = king.toCharArray();
        int[] kPos = new int[]{kingPosition[0] - 97, kingPosition[1] - 49};
        char[] amazonPostion = amazon.toCharArray();
        int[] aPos = new int[]{amazonPostion[0] - 97, amazonPostion[1] - 49};
        board[aPos[0]][aPos[1]] = 7;
        setKingPosition(kPos);
        setAmazonAtackArea(aPos);
        for (int[] line : board) {
            System.out.println(Arrays.toString(line));
        }
        for (int i = 0; i <= 7; i++) {
            System.arraycopy(board[i], 0, debugBoard[i], 0, 8);
        }
        for (int x = 0; x <= 7; x++) {
            for (int y = 0; y <= 7; y++) {
                if (board[x][y] == 0) { //free space
                    findStalemate(x, y);
                } else if (board[x][y] == 6) { //under atack
                    findCheckmate(x, y);
                }
            }
        }
        System.out.println("King Position: " + Arrays.toString(kPos) + " - Amazon Position: " + Arrays.toString(aPos));
        System.out.println("The amazon is guarded is: " + amazonIsGuarded);
        System.out.println("----------------------------------");
        System.out.println();
        for (int[] line : debugBoard) {
            System.out.println(Arrays.toString(line));
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        return answer;

    }

    private static void findCheckmate(int posX, int posY) {
        if (findXaround(posX, posY, 0)) { //escape found
            answer[1]++;
            debugBoard[posX][posY] = 2;
        } else if (!amazonIsGuarded && findXaround(posX, posY, 7)) { //can kill amazon
            answer[1]++;
            debugBoard[posX][posY] = 2;
        } else { //checkmate, can't go anywhere
            answer[0]++;
            debugBoard[posX][posY] = 1;
        }
    }

    private static void findStalemate(int posX, int posY) {
        if (findXaround(posX, posY, 0)) { //valid move possible
            answer[3]++;
            debugBoard[posX][posY] = 4;
        } else { //stalemate, can't go anywhere
            answer[2]++;
            debugBoard[posX][posY] = 3;
        }
    }

    private static void setKingPosition(int[] kPos) {
        for (int i = -1; i <= 1; i++) {
            if (kPos[0] + i >= 0 && kPos[0] + i <= 7) {
                for (int j = -1; j <= 1; j++) {
                    if (kPos[1] + j >= 0 && kPos[1] + j <= 7) {
                        if (board[kPos[0] + i][kPos[1] + j] == 0) {
                            board[kPos[0] + i][kPos[1] + j] = 8;
                        } else {
                            amazonIsGuarded = true;
                        }
                    }
                }
            }
        }
        board[kPos[0]][kPos[1]] = 9;
    }

    private static void setAmazonAtackArea(int[] aPos) {
        boolean kingInLine = false;
        int[] direction = new int[]{0, 0};
        for (int i = -2; i <= 2; i++) {
            if (aPos[0] + i >= 0 && aPos[0] + i <= 7) {
                for (int j = -2; j <= 2; j++) {
                    if (aPos[1] + j >= 0 && aPos[1] + j <= 7) {
                        if (board[aPos[0] + i][aPos[1] + j] == 0) {
                            board[aPos[0] + i][aPos[1] + j] = 6;
                        }
                    }
                }
            }
        }
        for (int i = 0; i <= 7; i++) {
            if (!kingInLine && i < aPos[1]) {
                if (board[aPos[0]][i] == 9) {
                    kingInLine = true;
                    direction = new int[]{0, -1};
                    continue;
                }
            } else if (!kingInLine && i > aPos[1]) {
                if (board[aPos[0]][i] == 9) {
                    kingInLine = true;
                    direction = new int[]{0, 1};
                    continue;
                }
            }
            if (board[aPos[0]][i] == 0) {
                board[aPos[0]][i] = 6;
            }
        }
        for (int i = 0; i <= 7; i++) {
            if (!kingInLine && i < aPos[0]) {
                if (board[i][aPos[1]] == 9) {
                    kingInLine = true;
                    direction = new int[]{-1, 0};
                    continue;
                }
            } else if (!kingInLine && i > aPos[0]) {
                if (board[i][aPos[1]] == 9) {
                    kingInLine = true;
                    direction = new int[]{1, 0};
                    continue;
                }
            }
            if (board[i][aPos[1]] == 0) {
                board[i][aPos[1]] = 6;
            }
        }
        for (int i = 0; i <= 7; i++) {
            //+1 +1
            if (aPos[0] + i <= 7 && aPos[1] + i <= 7) {
                if (board[aPos[0] + i][aPos[1] + i] == 9) {
                    kingInLine = true;
                    direction = new int[]{1, 1};
                } else if (board[aPos[0] + i][aPos[1] + i] == 0) {
                    board[aPos[0] + i][aPos[1] + i] = 6;
                }
            }
            //+1 -1
            if (aPos[0] + i <= 7 && aPos[1] - i >= 0) {
                if (board[aPos[0] + i][aPos[1] - i] == 9) {
                    kingInLine = true;
                    direction = new int[]{1, -1};
                } else if (board[aPos[0] + i][aPos[1] - i] == 0) {
                    board[aPos[0] + i][aPos[1] - i] = 6;
                }
            }
            //-1 +1
            if (aPos[0] - i >= 0 && aPos[1] + i <= 7) {
                if (board[aPos[0] - i][aPos[1] + i] == 9) {
                    kingInLine = true;
                    direction = new int[]{-1, 1};
                } else if (board[aPos[0] - i][aPos[1] + i] == 0) {
                    board[aPos[0] - i][aPos[1] + i] = 6;
                }
            }
            //-1 -1
            if (aPos[0] - i >= 0 && aPos[1] - i >= 0) {
                if (board[aPos[0] - i][aPos[1] - i] == 9) {
                    kingInLine = true;
                    direction = new int[]{-1, -1};
                } else if (board[aPos[0] - i][aPos[1] - i] == 0) {
                    board[aPos[0] - i][aPos[1] - i] = 6;
                }
            }
        }
        if (kingInLine) {
            removeKingInLineAtacks(aPos, direction);
        }
    }

    private static void removeKingInLineAtacks(int[] aPos, int[] direction) {
        boolean kingFound = false;
        for (int i = 1; i <= 7; i++) {
            if ((aPos[0] + direction[0] * i <= 7 && aPos[0] + direction[0] * i >= 0) &&
                    (aPos[1] + direction[1] * i <= 7 && aPos[1] + direction[1] * i >= 0)) {
                if (!kingFound) {
                    if (board[aPos[0] + direction[0] * i][aPos[1] + direction[1] * i] == 9) {
                        kingFound = true;
                    } else {
                        continue;
                    }
                }
                if (board[aPos[0] + direction[0] * i][aPos[1] + direction[1] * i] == 6) {
                    board[aPos[0] + direction[0] * i][aPos[1] + direction[1] * i] = 0;
                }
            }
        }
    }

    public static boolean findXaround(int posX, int posY, int value) {
        for (int i = -1; i <= 1; i++) {
            if (posX + i >= 0 && posX + i <= 7) {
                for (int j = -1; j <= 1; j++) {
                    if (posY + j >= 0 && posY + j <= 7) {
                        if (i == 0 && j == 0) {
                            continue;
                        }
                        if (board[posX + i][posY + j] == value) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}