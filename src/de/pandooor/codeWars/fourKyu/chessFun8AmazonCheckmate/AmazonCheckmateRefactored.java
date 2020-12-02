package de.pandooor.codeWars.fourKyu.chessFun8AmazonCheckmate;

public class AmazonCheckmateRefactored {
    public static int[] amazonCheckmate(String king, String amazon) {
        //TODO: Try and create a best practice and good readable solution for the kata



        return new int[4];
    }
}

class Field {
    public char pieceOnField = '0'; //Amazon -> A, King -> K
    public Field[] neighbors;
    public boolean underAttack = false;
    public boolean hiddenBehindOtherPiece = false;
    public boolean blockedByKing = false; //shows k





    public void findNeighbors(Field[] neighbors) {
        //TODO: implement
        this.neighbors = neighbors;
    }
}