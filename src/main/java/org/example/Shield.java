package org.example;

public abstract class Shield implements ShieldInt{
    protected int PointOfDefend;
    public Shield (int pointOfDefend){
        this.PointOfDefend = pointOfDefend;
    }

    public int getPointOfDefend() {
        return PointOfDefend;
    }
}
