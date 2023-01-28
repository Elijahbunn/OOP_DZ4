package org.example;

public class Archer extends Warrior{

    public Archer(String name, Bow bow, MagicShild shield, int healthPoint) {
        super(name, bow, healthPoint, shield);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }
    public int shotRange(){
        return ((Bow)getWeapon()).getRange();
    }

}
