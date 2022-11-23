package Monsters;

public class Troll extends Monster {
    public Troll(String attack, double health, double armor) {
        super(attack, health, armor);
    }

    @Override
    public int heal() {
        return 0;
    }

    @Override
    public int takeDamage() {
        return 0;
    }
}
