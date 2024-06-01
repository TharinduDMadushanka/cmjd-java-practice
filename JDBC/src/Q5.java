/**
 * Singleton Design Pattern --> class should have only one object
 */
public class Q5 {
    public static void main(String[] args) {
        A a1 =new A();
        a1.myMethod();
    }
}

class A{
    public A(){}

    public void myMethod(){
        System.out.println("myMethod in "+this);
    }
}
