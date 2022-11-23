package Melee;

import Behaviours.IAttack;
import Behaviours.IHealth;
import Behaviours.IPlayer;
import Behaviours.Weapons;

import java.util.HashMap;

public abstract class Melee implements IHealth, IAttack, IPlayer {

    private Weapons weapons;
    private double health;
    private double armor;
    private HashMap<String, Integer> inventory;


public Melee(Weapons weapons, double health, double armor, HashMap<String, Integer> inventory){
    this.weapons = weapons;
    this.health = health;
    this.armor = armor;
    this.inventory = new HashMap<>();
}



    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
}
