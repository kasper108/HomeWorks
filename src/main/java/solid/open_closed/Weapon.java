package solid.open_closed;

public class Weapon implements Attacker{
    private int damage;
    private int range;

    public Weapon(int damage, int range) {
        this.damage = damage;
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public void attack(){
    }
}
