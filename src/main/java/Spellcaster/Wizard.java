package Spellcaster;

import java.util.HashMap;

public class Wizard extends SpellCaster{
    public Wizard(String spells, double health, double armor, HashMap<String, Integer> inventory) {
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
}
