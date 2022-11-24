package Player.Melee;

import Behaviours.Weapons;

import java.util.HashMap;

public class Knight extends Melee{


    public Knight(Weapons weapons, double health, double armor, HashMap<String, Integer> inventory) {
        super(weapons, health, armor, inventory);
    }

//    @Override
//    public int heal() {
//        return 0;
//    }
}
