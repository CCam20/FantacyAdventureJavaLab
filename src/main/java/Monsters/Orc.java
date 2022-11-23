package Monsters;

public class Orc extends Monster {
    public Orc(int attack, double health, double armor) {
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

    @Override
    public int attack() {
        return 0;
    }
}
