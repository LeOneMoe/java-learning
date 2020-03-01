package com.javahometasks.task3_2;

import java.util.List;

public class ChessCell {
    private int x;
    private int y;

    final private static char[] CELL_LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    public ChessCell(String cell) throws IllegalArgumentException {
        if (ChessCell.xFromString(cell) > 7 || ChessCell.xFromString(cell) < 0)
            throw new IllegalArgumentException("x and y must be in interval of 0 to 7. You`ve provided x: " + x + ", y: " + y + ".");

        this.x = ChessCell.xFromString(cell);
        this.y = (cell.charAt(1) - '0') - 1;
    }

    public ChessCell(int x, int y) throws IllegalArgumentException {
        if (x > 7 || x < 0 || y > 7 || y < 0)
            throw new IllegalArgumentException("x and y must be in interval of 0 to 7. You`ve provided x: " + x + ", y: " + y + ".");

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws IllegalArgumentException {
        if (x > 7 || x < 0)
            throw new IllegalArgumentException("x must be in interval of 0 to 7. You`ve provided x: " + x + ".");
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalArgumentException {
        if (y > 7 || y < 0)
            throw new IllegalArgumentException("y must be in interval of 0 to 7. You`ve provided x: " + y + ".");

        this.y = y;
    }

    @Override
    public String toString() {
        return String.valueOf(CELL_LETTERS[x]) + (y + 1);
    }

    public static int xFromString(String cell) throws IllegalArgumentException{
        for (int i = 0; i < CELL_LETTERS.length; i++) {
            if (cell.charAt(0) == CELL_LETTERS[i])
                return i;
        }

        throw new IllegalArgumentException("Invalid cell: " + cell + ".");
    }

    public static boolean validKnightMove (ChessCell currentCell, ChessCell nextCell) {
        int dx = Math.abs(currentCell.x - nextCell.x);
        int dy = Math.abs(currentCell.y - nextCell.y);

        return dx == 1 && dy == 2 || dx == 2 && dy == 1;
    }

    public static String validKnightMoveSet(List<String> moves) throws InvalidKnightMove {
        ChessCell currentCell;
        ChessCell nextCell;

        for (int i = 0; i < moves.size() - 1; i++) {
            currentCell = new ChessCell(moves.get(i));
            nextCell = new ChessCell(moves.get(i + 1));

            if (!ChessCell.validKnightMove(currentCell, nextCell))
                throw new InvalidKnightMove(currentCell.toString(), nextCell.toString());
        }

        return "Move set is valid.";
    }
}
