package org.example;

public class Swordman extends Warrior {

    public Swordman(String name, Sword sword, int healthPoint, IronShield shield) {
        super(name, sword, healthPoint, shield);
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }

}
