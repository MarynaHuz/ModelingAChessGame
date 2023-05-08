package com.javajungle;

import java.util.Arrays;

import static com.javajungle.Color.WHITE;

public class ChessBoard {

    private ChessPiece[][] internalBoard = new ChessPiece[8][8];
    private ChessPiece[] whiteCapturedPieces = new ChessPiece[0];
    private ChessPiece[] blackCapturedPieces = new ChessPiece[0];


    public void add(ChessPiece piece, String coordinates) {
        Coordinates chessCoords = new Coordinates(coordinates);
        piece.setCoordinates(chessCoords);
        internalBoard[chessCoords.getX()][chessCoords.getY()] = piece;
    }

    public void move(ChessPiece piece, String destCoords) {
        Coordinates origin = piece.coordinates;
        Coordinates destination = new Coordinates(destCoords);
        if (isDestinationOccupiedByFriendly(piece, destination)) {
            return;
        } else if (isDestinationOccupiedByEnemy(piece, destination)) {
            ChessPiece capturedPiece = getPieceAtCoords(destCoords);
            capturedPiece.setCoordinates(null);
            if (piece.color == WHITE) {
                whiteCapturedPieces = addToCapturedPieces(capturedPiece, whiteCapturedPieces);
            } else {
                blackCapturedPieces = addToCapturedPieces(capturedPiece, blackCapturedPieces);
            }
        }
        performActualMove(piece, destCoords, origin, destination);
    }

    private ChessPiece[] addToCapturedPieces(ChessPiece capturedPiece, ChessPiece[] capturedPieces) {
        ChessPiece[] tmpCaptures = Arrays.copyOf(capturedPieces, capturedPieces.length + 1);
        tmpCaptures[capturedPieces.length] = capturedPiece;
        return tmpCaptures;
    }

    private void performActualMove(ChessPiece piece, String destinationCoords, Coordinates origin, Coordinates destination) {
        if (destination.isPermittedMove(piece.getValidMoves())) {
            internalBoard[origin.getX()][origin.getY()] = null; // remove from original square
            add(piece, destinationCoords);
        }

    }

    private boolean isDestinationOccupiedByFriendly(ChessPiece piece, Coordinates destination) {
        ChessPiece destinationPiece = internalBoard[destination.getX()][destination.getY()];
        return destinationPiece != null && destinationPiece.color == piece.color;
    }

    private boolean isDestinationOccupiedByEnemy(ChessPiece piece, Coordinates destination) {
        ChessPiece destinationPiece = internalBoard[destination.getX()][destination.getY()];
        return destinationPiece != null && destinationPiece.color != piece.color;
    }


    public ChessPiece getPieceAtCoords(String pieceAtCoords) {
        Coordinates coords = new Coordinates(pieceAtCoords);
        return internalBoard[coords.getX()][coords.getY()];
    }

    public ChessPiece[] getWhiteCapturedPieces() {
        return whiteCapturedPieces;
    }


}


