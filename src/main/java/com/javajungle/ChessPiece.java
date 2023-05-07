package com.javajungle;


import static com.javajungle.Color.WHITE;

enum Color{BLACK,WHITE}
public abstract class ChessPiece {
    private Color color;
    protected Coordinates coordinates;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    protected int calcYWithDirectionFactor(int yOffset) {
        int directionFactor = color == WHITE ? 1 : -1;
        return yOffset * directionFactor;
    }

    public abstract Coordinates[] getValidMoves();

}
