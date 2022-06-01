package lambda.lambda6;

import java.util.ArrayList;
import java.util.List;

public class WithoutLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();


        animals.add(new Animal("fish", false , true));
        animals.add(new Animal("kangaroo", true , false));
        animals.add(new Animal("rabbit", true , false));
        animals.add(new Animal("turtle", false , true));

        System.out.println("Can hop : ");
        print(animals, new CheckIfHopper());
        System.out.println();
        System.out.println("Can swim : ");
        print(animals, new CheckIfSwims());
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}