/*
 * Why we are creating main as static method?
 * Answer
 * 
 * To call non static method we need to create the object of that class
 * main method is entry point of execution.
 * so how can we create a class to call main even before the execution starts?
 * that's when the static keyword comes to rescue.
 * by defining main method as static, to call that method we do not need object of that class
 */

class Mobile{
    String brand;
    int price;
    static String type;

    // Static block is called one time only the class is loaded by class loader
    static{
        type = "SmartPhone";
        System.out.println("Inside static block");
    }

    // Constructor
    Mobile(){
        brand="";
        price=100;
        System.out.println("Inside constructor");
    }

    // Non static method called with objects only
    public void show(){
        System.out.println(brand + " " + price + " " + type);
    }

    // Static method called with class name only
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " " + obj.price + " " + type);
    }
}

public class Statickeyword {
    public static void main(String a[]){

        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=1100;
        // Mobile.type="Smartphone"; // Defined inside static block

        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=1000;
        // Mobile.type="Smartphone"; // Defined inside static block

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    
    }
}
