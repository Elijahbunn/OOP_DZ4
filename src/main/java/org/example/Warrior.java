package org.example;

public abstract class Warrior {
    private String name;
    private Weapon weapon;
    private Shield shield;
    private int healthPoint;

    public Warrior(String name, Weapon weapon, int healthPoint, Shield shield) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("name= %s, weapon= %s, shield = %s, healthPoint= %d", name, weapon, shield, healthPoint);
    }
    public int shotDefends(){
        return ((Shield)getShield()).getPointOfDefend();
    }
}
