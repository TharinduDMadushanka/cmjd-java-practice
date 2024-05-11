package Day11;

/**
 * Option 3
 */

public class Q7 {
    public static void main(String[] args) {
        A2 a2 =new A2();
        B2 b1 =new B2();
        b1.setA(a2);
        b1.mB();
    }
}
class A2{
    public void mA(){
        System.out.println("mA of A");
    }
}

class B2{
    A2 a2;

    public void mB(){
        a2.mA();
    }

    public void setA(A2 a2){
        this.a2 = a2;
    }
}
