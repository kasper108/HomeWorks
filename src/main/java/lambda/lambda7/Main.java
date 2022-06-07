package lambda.lambda7;

public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();

        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);
        switcher.addElectricityListener(() -> System.out.println("Fire !"));

        switcher.addElectricityListener(Main::Fire);

        //Event subscribe
        switcher.switchOn();
    }

    public static void Fire(){
        System.out.println("Super fire !!!");
    }
}
