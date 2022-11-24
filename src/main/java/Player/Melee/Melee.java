package Player.Melee;

import Behaviours.Weapons;
import Player.Player;

import java.util.HashMap;

public abstract class Melee extends Player {

    private Weapons weapons;


    public Melee(Weapons weapons, double health, double armor, HashMap<String, Integer> inventory) {
        super(health, armor, inventory);
        this.weapons = weapons;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public int attack(){
        return weapons.getDamage();

    }
}
