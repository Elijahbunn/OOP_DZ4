package org.example;

import java.util.Random;

public class Sword extends WeaponC{

    public Sword(int pointOfDamage){
        super(pointOfDamage);
    }
    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Sword damage = %d", pointOfDamage);
    }
}
