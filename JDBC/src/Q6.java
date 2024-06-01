/**
 * Singleton Design Pattern --> class should have only one object
 * Step 03
 * Done
 */
public class Q6 {
    public static void main(String[] args) {
        A a1 =A.getInstance();
        a1.myMethod();

        A a2 =A.getInstance();
        a2.myMethod();
    }
}

class A{

    /**
     * constructor should private
     */
    private static A a;

    private A(){}

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