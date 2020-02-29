package com.javahometasks.task2_1;

public class GrayScale implements Color{
    private int scale;

    public int r;
    public int g;
    public int b;

    public GrayScale(int scale) {
        this.scale = scale;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    @Override
    public RGB toRgb() {
        int r = (scale > 127) ? 255 : scale/2;
        int g = (scale > 127) ? scale/2 : 0;
        int b = (scale > 127) ? scale/2 : 0;

        return new RGB(r, g, b);
    }
}
