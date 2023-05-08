package com.javajungle;

import java.util.Objects;

public class Coordinates {
    private int x;
    private int y;
    String chessCoords;

    public Coordinates(String chessCoords) {
        this.chessCoords = chessCoords;
        char horizontal = chessCoords.charAt(0);
        int vertical = Integer.parseInt(chessCoords.substring(1));
        this.x = getXForLine(horizontal);
        this.y = getYForColumn(vertical);
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coordinates getOffset(int x, int y) {
        return new Coordinates(this.x + x, this.y + y);
    }

    public boolean isPermittedMove(Coordinates[] moves){
        for(int x = 0; x<moves.length;x++){
            if(moves[x].equals(this)){
                return true;
            }
        }
        return false;
    }
    protected static int getXForLine(char horizontal) {
        return horizontal - 97;
    }

    protected static int getYForColumn(int vertical) {
        return 8 - vertical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates that)) return false;
        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
