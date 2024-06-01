/**
 * Singleton Design Pattern --> class should have only one object
 *Step 01
 */
public class Q5 {
    public static void main(String[] args) {
        A a1 =new A();
        a1.myMethod();

        A a2 =new A();
        a2.myMethod();
    }
}

class A{

    private static A a;

    public A(){}

    public static A getInstance(){
        if (a==null){
            a= new A();
        }
        return a;
    }
    public void myMethod(){
        System.out.println("myMethod in "+this);
    }
}
