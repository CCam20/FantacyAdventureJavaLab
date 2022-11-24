package Player.Melee;

import Behaviours.Weapons;

import java.util.HashMap;

public class Dwarf extends Melee{
    public Dwarf(Weapons weapons, double health, double armor, HashMap<String, Integer> inventory) {
        super(weapons, health, armor, inventory);
    }


//    @Override
//    public int heal() {
//        return 0;
//    }
}
