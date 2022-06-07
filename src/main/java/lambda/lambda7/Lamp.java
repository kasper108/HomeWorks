package lambda.lambda7;

public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("Lamp is on !");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
