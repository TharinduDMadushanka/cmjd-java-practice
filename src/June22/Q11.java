package June22;

class A{
    int a;
    public void mA(){
        System.out.println("mA of A");
    }
}

class B extends A{
    int b;
    public void mB(){
        System.out.println("mB of B");
    }
}

class Example11 {
    public static void main(String args[]) {
        A a1 = new B();
        a1.a = 100; // Legal
        a1.mA(); // Legal

        // mB();
        //B b1 = a1; // Illegal
        B b1 = (B)a1; // Object Reference Casting
        b1.mB();
        b1.b = 200;
    }
}

