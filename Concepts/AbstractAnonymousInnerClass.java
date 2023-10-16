abstract class Car{
    public abstract void drive();
}

public class AbstractAnonymousInnerClass {
    public static void main(String a[]){

        Car car = new Car(){
            public void drive(){
                System.out.println("In anonymous inner class drive");
            }
        };

        car.drive();
    }
}
