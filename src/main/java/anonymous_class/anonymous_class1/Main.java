package anonymous_class.anonymous_class1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal() {
            public void eat(){
                System.out.println("Other Animal eating");
            }
        };

        animal1.eat();
    }
}

class Animal {
    public void eat(){
        System.out.println("Animal eating");
    }
}