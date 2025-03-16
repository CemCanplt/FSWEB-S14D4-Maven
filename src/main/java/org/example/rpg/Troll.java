package org.example.rpg;

// Troll sınıfı
public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public String toString() {
        return "Troll [Name: " + getName() + ", Hit Points: " + getHitPoints() +
                ", Base Damage: " + getDamage() +
                ", Bleed Damage: " + bleed() +
                ", Poison Damage: " + poison() +
                ", Total Attack Damage: " + attack() + "]";
    }
}
