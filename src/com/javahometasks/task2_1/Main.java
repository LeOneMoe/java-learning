package com.javahometasks.task2_1;

public class Main {
    public static void main(String[] args) {
        RGB a = new RGB(4,4,4);
        GrayScale b = new GrayScale(255);
        HSV c = new HSV(200, 0.2, 0.2);
        Paliterum palit = new Paliterum();

        System.out.println(a.toRgb().toString());
        System.out.println(b.toRgb().toString());
        System.out.println(c.toRgb().toString());
        System.out.println(RGB.metrics(new RGB(10, 10, 10), new RGB(20, 20, 20)));

        palit.addColor(a);
        palit.addColor(b);
        palit.addColor(c);

        System.out.println(palit.nearestColor(new RGB(10, 10, 10)));
    }
}
