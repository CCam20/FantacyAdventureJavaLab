package Player.Spellcaster;

import Behaviours.Spells;
import Player.Player;

import java.util.HashMap;

public abstract class SpellCaster extends Player {

    private Spells spells;

    public SpellCaster(Spells spells, double health, double armor, HashMap<String, Integer> inventory){
        super(health, armor, inventory);
        this.spells = spells;

    }

    public Spells getSpells() {
        return spells;
    }

    public int attack(){
        return spells.getDamage();
    }
}
