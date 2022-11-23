package Melee;

import java.util.HashMap;

public abstract class Melee {

    private String weapons;
    private double health;
    private double armor;
    private HashMap<String, Integer> inventory;


public Melee(String weapons, double health, double armor, HashMap<String, Integer> inventory){
    this.weapons = weapons;
    this.health = health;
    this.armor = armor;
    this.inventory = new HashMap<>();
}

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
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

}
