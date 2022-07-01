package solid.open_closed;

public class Character {
    private String name;
    private Weapon weapon;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        this.weapon.attack();
    }
}
