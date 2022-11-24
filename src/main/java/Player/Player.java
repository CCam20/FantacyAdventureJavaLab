package Player;

import Behaviours.HealingTools;
import Behaviours.IAttack;
import Behaviours.IHealth;
import Behaviours.Weapons;

import java.util.HashMap;



    public abstract class Player implements IHealth, IAttack {

        private double health;
        private HealingTools healingTools;
        private double armor;
        private HashMap<String, Integer> inventory;


        public Player(double health, double armor, HashMap<String, Integer> inventory) {
            this.health = health;
            this.armor = armor;
            this.inventory = new HashMap<>();
            this.healingTools
        }

        public double getHealth() {
            return this.health;
        }

        public double getArmor() {
            return armor;
        }

        public HashMap<String, Integer> getInventory() {
            return inventory;
        }

        public double takeDamage(double damage) {
            return this.health - damage;

        }

        public double heal(double healPoints) {
            return this.health + healPoints;
        }

        public void addGold(int gold) {
            inventory.put("Gold", gold);
        }

        public int getGold() {
            return inventory.get("Gold");
        }

        public double healPlayer() {
            return healingTools.getRecover();
        }
    }

