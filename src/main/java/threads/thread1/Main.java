package threads.thread1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("This Is New Thread");
        someMethod();
    }

    private void someMethod(){
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("This Is New Thread /implements runnable");
    }
}