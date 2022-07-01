package static_examples;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Car.speed = 100;

        car1.wheelCount = 4;
        car2.wheelCount = 3;

        System.out.println(Car.speed + " " + car1.wheelCount + " " + car2.wheelCount);

        System.out.println(car1.speed);
        car1.speed = 200;
        System.out.println(car1.speed);
    }
}
