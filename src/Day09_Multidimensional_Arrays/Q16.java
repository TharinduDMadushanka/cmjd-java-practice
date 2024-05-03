package Day09_Multidimensional_Arrays;

// previous question using for-each loop

class Q16 {
    public static void main(String[] args) {
        int br[][] = {{1,2},{10,20,30,40}, {100, 200, 300}};

        for (int[] ar : br) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
