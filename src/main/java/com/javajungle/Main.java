package com.javajungle;

import static com.javajungle.Color.BLACK;
import static com.javajungle.Color.WHITE;

public class Main {

    public static void main(String[] args) {

        ChessBoard board = new ChessBoard();
//        Pawn pawn = new Pawn(BLACK);
//        board.add(pawn, "a7");
//        System.out.println(pawn.getCoordinates());


        Knight knight = new Knight(WHITE);
        board.add(knight, "c1");
        System.out.println(knight.getCoordinates());

        board.move(knight, "d3");
        System.out.println(knight.getCoordinates());



    }
}
