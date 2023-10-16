public class RunnableThreadWithAnonymousClass {
    public static void main(String a[]) {
        Runnable obj1 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                }
        };

        Runnable obj2 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
