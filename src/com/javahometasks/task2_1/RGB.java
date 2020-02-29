package com.javahometasks.task2_1;

public class RGB implements Color {
    private int r;
    private int g;
    private int b;

    public RGB(double r, double g, double b) {
        this.r = (int) r;
        this.g = (int) g;
        this.b = (int) b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static double metrics(RGB colorOne, RGB colorTwo) {
        return Math.sqrt(
                Math.pow(colorOne.getR() - colorTwo.getR(), 2) +
                Math.pow(colorOne.getG() - colorTwo.getG(), 2) +
                Math.pow(colorOne.getB() - colorTwo.getB(), 2)
        );
    }

    @Override
    public RGB toRgb() {
        return this;
    }

    @Override
    public String toString() {
        return r + " " + g + " " + b;
    }
}
