package anonymous_class.anonymous_class2;

interface Animal{
    public void eat();
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal eating");
            }
        };

        animal.eat();
    }
}
