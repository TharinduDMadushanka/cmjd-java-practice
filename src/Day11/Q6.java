//package Day11;
//
///**
// * Option 2 --. default constructor
// */
//
//public class Q6 {
//    public static void main(String[] args) {
//        A4 a = new A4();
//        B5 b1 = new B5(a);
//        b1.mB();
//    }
//}
//class A{
//    public void mA(){
//        System.out.println("mA of A");
//    }
//}
//
//class B{
//    A4 a1;//reference --> given error because a1 not initialize
//    B(A4 a1){
//        this.a1 = a1;
//    }
//
//
//    public void mB(){
//        a1.mA();
//    }
//}
