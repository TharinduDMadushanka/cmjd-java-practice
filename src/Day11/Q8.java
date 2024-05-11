package Day11;

/**
 * Option 4
 */

class A3{
    public void mA(){
        System.out.println("mA of A");
    }
}

class B3{
    public void mB(A3 a1){
        a1.mA();
    }
}

class Example {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b1 = new B3();
        b1.mB(a);
    }
}
