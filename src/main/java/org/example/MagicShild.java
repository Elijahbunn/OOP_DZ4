package org.example;

import java.util.Random;

public class MagicShild extends Shield{
    private int pointOfDefends = getPointOfDefend();
    private int pointOfHealing;
    public MagicShild(int pointOfDefeds, int pointOfHealing){
        super(pointOfDefeds);
        this.pointOfHealing = pointOfHealing;
    }
    @Override
    public int defends() {
        return new Random().nextInt(0, pointOfDefends);
    }

    public int getPointOfHealing() {
        return pointOfHealing;
    }

    @Override
    public String toString() {
        return String.format("pointOfHealing = %d,   PointOfDefend = %d", pointOfHealing, PointOfDefend);
    }
}
