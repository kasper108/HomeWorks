package threads.thread2;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
        new MyThread1().start();

    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0 ;  i < 200 ; i++){
            System.out.println("Thread name : " + Thread.currentThread().getName() + " i = " + i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        for(int i = 0 ;  i < 200 ; i++){
            System.out.println("Thread name : " + Thread.currentThread().getName() + " i = " + i);
        }
    }
}
