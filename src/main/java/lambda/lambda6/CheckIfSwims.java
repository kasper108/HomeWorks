package lambda.lambda6;

public class CheckIfSwims implements CheckTrait{
    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
