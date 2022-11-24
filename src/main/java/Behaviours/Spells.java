package Behaviours;

public enum Spells {
    FIREBALL(8),
    LIGHTNINGBOLT(9),
    WINDSTRIKE(7),
    EARTHQUAKE(5);

    private int damage;

    Spells(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
