package Monsters;

public class Troll extends Monster {
    public Troll(double attack, double health, double armor) {
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
