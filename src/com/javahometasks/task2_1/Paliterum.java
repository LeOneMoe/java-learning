package com.javahometasks.task2_1;

import java.util.LinkedList;
import java.util.List;

public class Paliterum {
    List<Color> paliterum = new LinkedList<>();

    public Paliterum() {
    }

    public Paliterum(List<Color> paliterum) {
        this.paliterum = paliterum;
    }

    public List<Color> getPaliterum() {
        return paliterum;
    }

    public void setPaliterum(List<Color> paliterum) {
        this.paliterum = paliterum;
    }

    public void addColor(Color color) {
        paliterum.add(color);
    }

    public double nearestColor(Color color) {
        double minMetrics = 0;

        for (Color paliterumColor: paliterum) {
            double metrics = (Math.abs(RGB.metrics(paliterumColor.toRgb(), color.toRgb())));

            if (minMetrics < metrics)
                minMetrics = metrics;
        }

        return minMetrics;
    }
}
