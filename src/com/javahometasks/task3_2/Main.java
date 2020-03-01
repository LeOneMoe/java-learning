package com.javahometasks.task3_2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidKnightMove {
        List<String> moves = new LinkedList<>();
        moves.add("g8");
        moves.add("e7");
        moves.add("c8");

        System.out.println(ChessCell.validKnightMoveSet(moves));
    }
}
