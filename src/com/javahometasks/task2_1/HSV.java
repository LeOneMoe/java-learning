package com.javahometasks.task2_1;

public class HSV implements Color {
    private double h;
    private double s;
    private double v;

    public HSV(double h, double s, double v) {
        this.h = h;
        this.s = s;
        this.v = v;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    public RGB toRgb() {
        double c = v * s;
        double x = c * (1 - Math.abs((h / 60) % 2 - 1));
        double m = v - c;

        double r;
        double g;
        double b;

        if (h < 60) {
            r = c;
            g = x;
            b = 0;
        }
        else if (h < 120) {
            r = x;
            g = c;
            b = 0;
        }
        else if (h < 180) {
            r = 0;
            g = c;
            b = x;
        }
        else if (h < 240) {
            r = 0;
            g = x;
            b = c;
        }
        else if (h < 300) {
            r = x;
            g = 0;
            b = c;
        }
        else {
            r = c;
            g = 0;
            b = x;
        }

        r = (r + m) * 255;
        g = (g + m) * 255;
        b = (b + m) * 255;

        return new RGB(r, g, b);
    }
}
