package Monsters;

import Behaviours.IAttack;
import Behaviours.IHealth;

public abstract class Monster implements IHealth, IAttack {
    private int attack;
    private double health;
    private double armor;


    public Monster(int attack, double health, double armor) {
        this.attack = attack;
        this.health = health;
        this.armor = armor;
    }

    public int getAttack() {
        return attack;
    }

    public double getHealth() {
        return health;
    }

    public double getArmor() {
        return armor;
    }
}
