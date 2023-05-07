package com.javajungle;

public class Knight extends ChessPiece{


    public Knight(Color color) {
        super(color);
    }

    @Override
    public Coordinates[] getValidMoves() {

        Coordinates[] validMoves = new Coordinates[8];

        Coordinates northEast = getCoordinates().getOffset(1, calcYWithDirectionFactor(-2));
        validMoves[0] = northEast;

        Coordinates northWest = getCoordinates().getOffset(-1, calcYWithDirectionFactor(-2));
        validMoves[1] = northWest;

        Coordinates eastNorth = getCoordinates().getOffset(2, calcYWithDirectionFactor(-1));
        validMoves[2] = eastNorth;

        Coordinates eastSouth = getCoordinates().getOffset(2, calcYWithDirectionFactor(1));
        validMoves[3] = eastSouth;

        Coordinates westNorth = getCoordinates().getOffset(-2, calcYWithDirectionFactor(-1));
        validMoves[4] = westNorth;

        Coordinates westSouth = getCoordinates().getOffset(-2, calcYWithDirectionFactor(1));
        validMoves[5] = westSouth;

        Coordinates southWest = getCoordinates().getOffset(-1, calcYWithDirectionFactor(2));
        validMoves[6] = southWest;

        Coordinates southEast = getCoordinates().getOffset(1, calcYWithDirectionFactor(2));
        validMoves[7] = southEast;

        return validMoves;
    }
}
