package Garbage_Collection_June22;

/**
 * create Q1[] array and pass all objects to it
 * but it runs only i=1953
 * error = Java heap space out
 */

class Q2{
    long[] ar = new long[100000];
}
class Example1 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        Q2[] myClasses = new Q2[100000];

        for(int i = 0; i < 100000; i++){
            System.out.println("i : " + i);
            myClasses[i] = new Q2();
        }

        System.out.println("End Main");
    }
}
