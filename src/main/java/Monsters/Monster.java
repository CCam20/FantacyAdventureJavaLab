package Monsters;

public abstract class Monster {
    private String attack;
    private double health;
    private double armor;


    public Monster(String attack, double health, double armor) {
        this.attack = attack;
        this.health = health;
        this.armor = armor;
    }
}
