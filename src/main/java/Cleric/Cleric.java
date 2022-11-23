package Cleric;

import Behaviours.IAttack;
import Behaviours.IHealth;
import Behaviours.IPlayer;

import java.util.HashMap;

public class Cleric implements IHealth, IAttack, IPlayer {

    private String healingTools;
    private double health;
    private double armor;
    private HashMap<String, Integer> inventory;


    public Cleric(String healingTools, double health, double armor, HashMap<String, Integer> inventory){
        this.healingTools = healingTools;
        this.health = health;
        this.armor = armor;
        this.inventory = new HashMap<>();
    }

    @Override
    public int heal() {
        return 0;
    }

    @Override
    public int takeDamage() {
        return 0;
    }

    @Override
    public int attack() {
        return 0;
    }
}
