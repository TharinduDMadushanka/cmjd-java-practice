package Basics;

/* Method overloading
1.change parameter
2.change order
3.change data type
 */

class Q26 {

    public static void myMethod(int i, double d){
        System.out.println("myMethod(int, double)");
    }

    public static void myMethod(double d, int i){ // Different Parameters -> legal
        System.out.println("myMethod(double, int)");
    }
    public static void main(String[] args) {

    }
}
