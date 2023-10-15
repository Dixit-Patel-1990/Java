class Demo {

    int result = 5;
    public void show(){
        System.out.println("In Demo Show");
    }

    class InnerClassExample {
        public void show2(){
            System.out.println("In Innner class show2");
        }
    }
}

class StaticDemo {

    static class InnerClassExample {
        public void show3(){
            System.out.println("In Innner class show2");
        }
    }
}
class InnerClass {
    public static void main(String a[]) {

        Demo obj = new Demo();
        System.out.println(obj.result);
        obj.show();

        // To access methods of inner class
        Demo.InnerClassExample obj2 = obj.new InnerClassExample();
        obj2.show2();


        // Static class access
        StaticDemo.InnerClassExample obj3 = new StaticDemo.InnerClassExample();
        obj3.show3();
    }

}