package Spellcaster;

import Behaviours.Spells;

import java.util.HashMap;

public class Wizard extends SpellCaster{
    public Wizard(Spells spells, double health, double armor, HashMap<String, Integer> inventory) {
        super(spells, health, armor, inventory);
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
        return 0;
    }
}
