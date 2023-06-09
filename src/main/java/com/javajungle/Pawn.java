package com.javajungle;


public class Pawn extends ChessPiece {

    private boolean hasMoved = false;

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public Coordinates[] getValidMoves() {
        int numbersOfPossibleMoves = hasMoved ? 3 : 4;
        Coordinates[] validMoves = new Coordinates[numbersOfPossibleMoves];

        Coordinates forwardOne = getCoordinates().getOffset(0, calcYWithDirectionFactor(-1));
        validMoves[0] = forwardOne;

        Coordinates diagonallyRightOne = getCoordinates().getOffset(1, calcYWithDirectionFactor(-1));
        validMoves[1] = diagonallyRightOne;

        Coordinates diagonallyLeftOne = getCoordinates().getOffset(-1, calcYWithDirectionFactor(-1));
        validMoves[2] = diagonallyLeftOne;

        if (!hasMoved) {
            Coordinates forwardTwo = getCoordinates().getOffset(0, calcYWithDirectionFactor(-2));
            validMoves[3] = forwardTwo;
        }
        return validMoves;
    }


    @Override
    public void setCoordinates(Coordinates coordinates) {
        if (this.coordinates != null) {
            hasMoved = true;
        }
        super.setCoordinates(coordinates);
    }
}


