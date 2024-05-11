//package Day11;
//
//public class Q12 {
//    public static void main(String[] args) {
//        new B();
//    }
//}
//
//class A{
//    int a;
//    public void printA(){
//        System.out.println("a : " + a);
//    }
//
//    static{
//        System.out.println("Static block A");
//    }
//}
//
//class B extends A{
//    int b;
//    public void printB(){
//        System.out.println("b : " + b);
//    }
//
//    public void printAB(){
//        System.out.println("a : " + a); // from A
//        System.out.println("b : " + b);
//    }
//
//    public void callPrint(){
//        printA(); // from A
//        printB();
//    }
//
//    static{
//        System.out.println("Static block B");
//    }
//}
