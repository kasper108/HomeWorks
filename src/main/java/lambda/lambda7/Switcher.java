package lambda.lambda7;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener){
        listeners.remove(listener);
    }

    public void switchOn(){
        System.out.println("Switcher is on !");
        for(ElectricityConsumer consumer: listeners){
            consumer.electricityOn();
        }
    }
}
