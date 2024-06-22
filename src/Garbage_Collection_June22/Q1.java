package Garbage_Collection_June22;

/**
 * long = 64 bits
 * for 100000 objects we should have 78.125 GB but my computer has 8 GB RAM
 * but program runs
 * in here create Unused objects(objects without references)
 * JVM has Garbage collector software
 * it removes unused objects
 */
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

