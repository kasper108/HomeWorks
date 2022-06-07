package lambda.lambda7;

public class Radio implements ElectricityConsumer{
    public void playMusic(){
        System.out.println("Radio plays music");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
