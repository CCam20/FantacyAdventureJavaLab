package Melee;

import Behaviours.Weapons;

import java.util.HashMap;

public class Barbarian extends Melee{
    public Barbarian(Weapons weapons, double health, double armor, HashMap<String, Integer> inventory) {
        super(weapons, health, armor, inventory);
    }

    @Override
    public int heal() {
        return 0;
    }

    @Override
    public int takeDamage() {
        return 0;
    }

    @Override
    public int attack() {
        return getWeapons().getDamage();
    }
}
