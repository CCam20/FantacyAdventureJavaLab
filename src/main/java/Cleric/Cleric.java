package Cleric;

import java.util.HashMap;

public class Cleric {

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
}
