package Garbage_Collection_June22;

class Q1{
    long[] ar = new long[100000];
}
class Example {
    public static void main(String args[]) {
        System.out.println("Start Main");

        for(int i = 0; i < 100000; i++){
            System.out.println("i : " + i);
            new Q1();
        }

        System.out.println("End Main");
    }
}

