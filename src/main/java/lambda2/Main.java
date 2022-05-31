package lambda2;

interface Executable{
    void execute();
}

class Runner{
    public void run(Executable e){
        e.execute();
    }
}

class ExecutableImplementation implements Executable{

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        // Anonymous class
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello Anonymous class");
            }
        });

        // Using class with implementation
        runner.run(new ExecutableImplementation());

        // Using lambda
        runner.run(() -> System.out.println("Hello"));
    }
}
