package lambda3;

interface Executable{
    void execute();
}

class Runnable{
    void run(Executable e){
        e.execute();
    }
}

class ExecutableImpl implements Executable{

    @Override
    public void execute() {
        System.out.println("Hello Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable();

        runnable.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello Anonymous");
            }
        });

        runnable.run(new ExecutableImpl());

        runnable.run(() -> System.out.println("HEllo"));
    }
}
