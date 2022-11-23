package Spellcaster;

import Behaviours.IHealth;

import java.util.HashMap;

public abstract class SpellCaster implements IHealth {

    private String spells;
    private double health;
    private double armor;
    private HashMap<String, Integer> inventory;


    public SpellCaster(String spells, double health, double armor, HashMap<String, Integer> inventory){
        this.spells = spells;
        this.health = health;
        this.armor = armor;
        this.inventory = new HashMap<>();
    }
}
