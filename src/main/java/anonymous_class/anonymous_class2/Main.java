package anonymous_class.anonymous_class2;

interface Animal{
    public void eat();
    public void sleep();
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal eating");
            }

            @Override
            public void sleep(){
                System.out.println("Animal sleeping");
            }
        };

        animal.eat();
        animal.sleep();
    }
}
