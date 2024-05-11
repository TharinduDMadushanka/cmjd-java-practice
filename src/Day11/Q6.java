package Day11;

/**
 * Option 2
 */

public class Q6 {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B(a);
        b1.mB();
    }
}
class A{
    public void mA(){
        System.out.println("mA of A");
    }
}

class B{
    A a1;//reference --> given error because a1 not initialize
    B(A a1){
        this.a1 = a1;
    }


    public void mB(){
        a1.mA();
    }
}
