package lambda.lambda6;

import java.util.ArrayList;
import java.util.List;

public class WithLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("fish", false , true));
        animals.add(new Animal("kangaroo", true , false));
        animals.add(new Animal("rabbit", true , false));
        animals.add(new Animal("turtle", false , true));

        print(animals, a -> a.canSwim());
        print(animals, a -> a.canHop());

        print(animals, Animal::canSwim);
        print(animals, Animal::canHop);
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}
