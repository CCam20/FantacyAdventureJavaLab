package Monsters;

public class Dragon extends Monster {
    public Dragon(int attack, double health, double armor) {
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
