package interfaces.interface1;

public class Mi8 extends Helicopter{
    @Override
    public void fly() {
        System.out.println("Helicopter");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Vertical take off");
    }
}
