class Car {
    public void drive() {
        System.out.println("In Car drive");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("In WagonR drive");
    }
}

public class AnonymousInnerClass {
    public static void main(String a[]) {

        // Inheritance way of overridding the method drive
        WagonR car1 = new WagonR();
        car1.drive();

        // Anonymous Inner class way of overridding the method drive
        WagonR car2 = new WagonR() {
            public void drive() {
                System.out.println("In Anonymous Inner class drive");
            }
        };
        car2.drive();
    }
}
