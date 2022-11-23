package Spellcaster;

import Behaviours.IAttack;
import Behaviours.IHealth;
import Behaviours.IPlayer;
import Behaviours.Spells;

import java.util.HashMap;

public abstract class SpellCaster implements IHealth, IAttack, IPlayer {

    private Spells spells;
    private double health;
    private double armor;
    private HashMap<String, Integer> inventory;


    public SpellCaster(Spells spells, double health, double armor, HashMap<String, Integer> inventory){
        this.spells = spells;
        this.health = health;
        this.armor = armor;
        this.inventory = new HashMap<>();
    }
}
