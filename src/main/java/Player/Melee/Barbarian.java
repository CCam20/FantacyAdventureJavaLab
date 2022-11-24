package Player.Melee;

import Behaviours.Weapons;

import java.util.HashMap;

public class Barbarian extends Melee{
    public Barbarian(Weapons weapons, double health, double armor, HashMap<String, Integer> inventory) {
        super(weapons, health, armor, inventory);
    }

//    public double heal(int healPoints) {
//        return this.health + healPoints;
//    }

//    @Override
//    public double attack() {
//        return getWeapons().getDamage();
//    }


}
