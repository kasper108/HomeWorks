package threads.thread3;

import static java.lang.Thread.currentThread;

public class Main {
    public static void main(String[] args) throws Exception{
        Resource resource = new Resource();
        resource.setI(5);

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.setResource(resource);
        myThread2.setResource(resource);

        myThread1.start();
        myThread2.start();


        //myThread1.join();
        //myThread2.join();

        System.out.println(resource.getI());
    }
}

class MyThread extends Thread{

    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run(){
        resource.changeI();
    }
}

class Resource {
    private int i;

    public synchronized void changeI(){
        int i = this.i;
        i++;
        this.i = i;
        System.out.println(currentThread().getName());
    }

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }
}

