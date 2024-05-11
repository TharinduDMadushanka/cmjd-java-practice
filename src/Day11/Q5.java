package Day11;

/**
 * Option 1
 */
public class Q5 {
    public static void main(String[] args) {
        B b1 =new B();
        b1.mB();
    }
}
class A{
    public void mA(){
        System.out.println("mA of A");
    }
}

class B{
    A a1 = new A();

    public void mB(){
        a1.mA();
    }
}
