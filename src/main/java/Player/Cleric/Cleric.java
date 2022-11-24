package Player.Cleric;

import Behaviours.HealingTools;
import Player.Player;

import java.util.HashMap;

public class Cleric extends Player {

    private HealingTools healingTools;


    public Cleric(HealingTools healingTools, double health, double armor, HashMap<String, Integer> inventory) {
        super(health, armor, inventory);
        this.healingTools = healingTools;

    }




    @Override
    public int attack() {
        return 0;
    }
//
//    public int heal() {
//        return 0;
//    }
}
