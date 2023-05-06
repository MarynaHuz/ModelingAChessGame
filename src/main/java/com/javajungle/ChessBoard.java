package com.javajungle;

public class ChessBoard {

    private Knight knight;
    private Pawn pawn;

    public void add(Knight knight, String coordinates) {
    }
    public void add(Pawn pawn, String coordinates) {
    }

    public void move(Knight knight, String d3) {
    }

    public void move(Pawn pawn, String coordinates) {
    }

    public Object getPieceAtCoords(String pieceAtCoords) {
        return null;
    }

    public Object[] getWhiteCapturedPieces() {
        return null;
    }
}


//private static String getArrayCoords(String chessCoords) {
//        char file = chessCoords.charAt(0);
//        int rank = Integer.parseInt(Character.toString(chessCoords.charAt(1)));
//        int x = getXForFile(file);
//        int y = getYForRank(rank);
//        return String.format("%d, %d", x, y);
//    }
//
//    private static int getXForFile(char file) {
//        return file - 97;
//    }
//
//    private static int getYForRank(int rank) {
//        return 8 - rank;
//    }