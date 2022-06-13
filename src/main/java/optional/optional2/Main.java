package optional.optional2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new  Person("Bob", null);

        System.out.println(person1.getEmail()
                .map(String::toUpperCase)
                .orElse("No email"));
    }
}

class Person{
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
