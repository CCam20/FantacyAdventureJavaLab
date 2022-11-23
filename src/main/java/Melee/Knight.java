package Melee;

import java.util.HashMap;

public class Knight extends Melee{


    public Knight(String weapons, double health, double armor, HashMap<String, Integer> inventory) {
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
}
