package optional.optional1;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        Optional<String> empty2 = Optional.ofNullable("Hello");

        System.out.println(empty2.isPresent());
        System.out.println(empty2.isEmpty());

        System.out.println(empty2);

        String s = empty2
                .map(String::toUpperCase)
                .orElse("GoodBye");

        System.out.println(s);

        Optional<String> hello = Optional.ofNullable(null);

        hello.ifPresentOrElse(System.out::println, () -> System.out.println("World"));


    }
}
