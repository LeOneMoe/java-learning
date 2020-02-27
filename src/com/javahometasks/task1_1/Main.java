package com.javahometasks.task1_1;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double area(Point p1, Point p2, Point p3) {
        double a, b, c, p;

        a = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        b = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        c = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getY() - p3.getY(), 2));

        p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        List<Point> point = new ArrayList();

        point.add(new Point(3, 2));
        point.add(new Point(7, 5));
        point.add(new Point(0, 0));

        System.out.println(area(point.get(0), point.get(1), point.get(2)));
    }
}
