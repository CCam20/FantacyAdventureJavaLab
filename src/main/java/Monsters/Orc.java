package Monsters;

public class Orc extends Monster {
    public Orc(double attack, double health, double armor) {
        super(attack, health, armor);
    }

//    @Override
//    public int heal() {
//        return 0;
//    }

    @Override
    public double takeDamage(double damage) {
        return 0;
    }

}
