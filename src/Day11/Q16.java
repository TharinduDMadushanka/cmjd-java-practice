package Day11;

class A {
    int a;

    public void printA() {
        System.out.println("a : " + a);
    }
}

class B extends A {
    int b;

    public void printB() {
        System.out.println("b : " + b);
    }
}

class Example {
    public static void main(String[] args) {
        B b1 = new B();
        b1.a = 100; // Legal
        b1.printA(); // Legal

        b1.b = 100;
        b1.printB();

        A a1 = new B(); // Legal -> B IS-A A
        a1.a = 300; // Legal
        a1.printA();

        /** --> Illegal because compiler thinks "A a1 = new B();" this is an A type
         * object in class A there no attribute called b
         a1.b = 400; // Illegal
         a1.printB(); // Illegal
         */
    }
}
