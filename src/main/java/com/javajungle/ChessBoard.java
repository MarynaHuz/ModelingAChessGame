package com.javajungle;

public class ChessBoard {

    private ChessPiece[][] internalBoard = new ChessPiece[8][8];
    private ChessPiece[] whiteCapturedPieces = new ChessPiece[0];
    private ChessPiece[] blackCapturedPieces = new ChessPiece[0];


    public void add(ChessPiece piece, String coordinates) {
        Coordinates chessCoords = new Coordinates(coordinates);
        piece.setCoordinates(chessCoords);
        System.out.println(internalBoard[chessCoords.getX()][chessCoords.getY()] = piece);
    }

    public void move(ChessPiece piece, String coordinates) {
        internalBoard[piece.getCoordinates().getX()][piece.getCoordinates().getY()] = null;
        Coordinates newCoords = new Coordinates(coordinates);
        piece.setCoordinates(newCoords);
        System.out.println(internalBoard[newCoords.getX()][newCoords.getY()] = piece);
    }


    public ChessPiece getPieceAtCoords(String pieceAtCoords) {
        Coordinates coords = new Coordinates(pieceAtCoords);
        return internalBoard[coords.getX()][coords.getY()];
    }

    public Object[] getWhiteCapturedPieces() {
        return null;
    }


}


