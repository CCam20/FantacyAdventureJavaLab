package Behaviours;

public enum HealingTools {
    POTION(4),
    HERBS(2);

    private double recover;

    HealingTools(double recover){
        this.recover = recover;
    }

    public double getRecover() {
        return recover;
    }
}
