/*
 * Important here is "synchronized" keyword in increment method
 * t1.join() and t2.join()
 * 
 */

class A {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized int increment() {
        return count++;
    }

}

public class ThreadSafe {

    public static void main(String a[]) throws InterruptedException{
        A count = new A();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count.getCount());
    }
}
