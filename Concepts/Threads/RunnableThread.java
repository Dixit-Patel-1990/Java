/*
 * Extending thread class will block us from extending to some other class
 * so better we implements Runnable interface
 * When we use Runnable interface, it has run method
 * but when we create object of A and B we can not call start method as
 * Runnable does not have it.
 * so we need to create 2 separate thread objects and pass A & B objects to that.
 */



class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }

    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class RunnableThread {
    public static void main(String a[]) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
