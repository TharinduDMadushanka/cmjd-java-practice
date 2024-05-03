package Day09_Multidimensional_Arrays;

// Case 2

class Q12 {
    public static void main(String[] args) {
        int[][][] c;
        c = new int[4][3][2];

        System.out.println(c); // Reference to 3D array
        System.out.println(c[0]); // Reference to 2D array
        System.out.println(c[0][0]); // Reference to 1D array
        System.out.println(c[0][0][0]); // int type element
    }
}
