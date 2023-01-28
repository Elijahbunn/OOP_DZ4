package org.example;

import java.util.Random;

public class IronShield extends Shield{
    private int pointOfDefends = getPointOfDefend();
    public IronShield (int pointOfDefends){super(pointOfDefends);}
    @Override
    public int defends() {
        return new Random().nextInt(0, pointOfDefends);
    }

    @Override
    public String toString() {
        return String.format("Defends of iron shield = %d", pointOfDefends);
    }
}
