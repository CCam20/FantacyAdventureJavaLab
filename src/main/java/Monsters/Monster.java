package Monsters;

import Behaviours.IAttack;
import Behaviours.IHealth;

public abstract class Monster implements IHealth {
    private double attack;
    private double health;
    private double armor;


    public Monster(double attack, double health, double armor) {
        this.attack = attack;
        this.health = health;
        this.armor = armor;
    }

    public double getAttack() {
        return this.attack;
    }

    public double getHealth() {
        return health;
    }

    public double getArmor() {
        return armor;
    }

    public double takeDamage(double damage) {
        return this.health - damage;

    }
}

//    @Override
//    public int heal() {
//        return 0;
//    }
//}
