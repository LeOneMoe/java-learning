package com.javahometasks.task3_1;

public class ChessCell {
    private int x;
    private int y;

    public ChessCell(int x, int y) throws IllegalArgumentException {
        if (x > 7 || x < 0 || y > 7 || y < 0)
            throw new IllegalArgumentException("x and y must be in interval of 0 to 7. You`ve inserted x: " + x + ", y: " + y + ".");

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws IllegalArgumentException {
        if (x > 7 || x < 0)
            throw new IllegalArgumentException("x must be in interval of 0 to 7. You`ve inserted x: " + x + ".");
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalArgumentException {
        if (y > 7 || y < 0)
            throw new IllegalArgumentException("y must be in interval of 0 to 7. You`ve inserted x: " + y + ".");

        this.y = y;
    }

    @Override
    public String toString() {
        char[] cellLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        return String.valueOf(cellLetters[x]) + (y + 1);
    }
}
