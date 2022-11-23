package Spellcaster;

import java.util.HashMap;

public class Warlock extends SpellCaster{
    public Warlock(String spells, double health, double armor, HashMap<String, Integer> inventory) {
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
