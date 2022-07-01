package solid.open_closed;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Sword(15, 2);
        Character character = new Character("Knight", sword);
        Weapon crossbow = new Crossbow(40,100);

        character.attack();

        character.changeWeapon(crossbow);

        character.attack();
    }
}
