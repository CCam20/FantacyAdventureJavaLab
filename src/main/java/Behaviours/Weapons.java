package Behaviours;

public enum Weapons {
    SWORD(5),
    AXE(6),
    CLUB(4);

    private int damage;

     Weapons(int damage){
         this.damage = damage;
     }

    public int getDamage() {
        return damage;
    }
}
