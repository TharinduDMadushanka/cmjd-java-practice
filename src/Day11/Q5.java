package Day11;

/**
 * Option 1 --> create object from A1 class
 */
public class Q5 {
    public static void main(String[] args) {
        B1 b1 =new B1();
        b1.mB();
    }
}
class A1{
    public void mA(){
        System.out.println("mA of A");
    }
}

class B1{
    A1 a1 = new A1();

    public void mB(){
        a1.mA();
    }
}
