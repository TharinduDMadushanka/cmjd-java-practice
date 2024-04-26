package Day08;

class Q23 {
    public static void printTotal(int... a){ // int[] a
        int tot = 0;
        for(int i : a){
            System.out.print( i + " + ");
            tot += i;
        }

        System.out.println("\b\b = " + tot);
    }

    public static void main(String[] args) {
        printTotal(new int[]{10,20,30}); // Even we can pass arrays also
    }
}
