package Monsters;

public class Ogre extends Monster{
    public Ogre(int attack, double health, double armor) {
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
