package solid.open_closed;

public class Sword extends Weapon{
    public Sword(int damage, int range) {
        super(damage, range);
    }

    @Override
    public void attack() {
        System.out.println("Hit with sword and damage : " + this.getDamage());
    }
}
