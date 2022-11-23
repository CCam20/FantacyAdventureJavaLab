package Monsters;

import Behaviours.IHealth;

public abstract class Monster implements IHealth {
    private String attack;
    private double health;
    private double armor;


    public Monster(String attack, double health, double armor) {
        this.attack = attack;
        this.health = health;
        this.armor = armor;
    }
}
