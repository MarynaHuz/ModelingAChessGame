package com.javajungle;


enum Color{BLACK,WHITE}
public class ChessPiece {
    protected Color color;
    protected Coordinates coordinates;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public void setCoordinates(Coordinates c1) {
    }

    public Coordinates[] getValidMoves() {
        return null;
    }
}
