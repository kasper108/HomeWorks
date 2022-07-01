package solid.open_closed;

public class Crossbow extends Weapon{
    public Crossbow(int damage, int range) {
        super(damage, range);
    }

    @Override
    public void attack() {
        System.out.println("Hit with crossbow and damage : " + this.getDamage());
    }
}
