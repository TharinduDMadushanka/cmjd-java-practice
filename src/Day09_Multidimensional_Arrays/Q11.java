package Day09_Multidimensional_Arrays;

// case 01
class Q11 {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        System.out.println(a); // prints [I@43a25848
        a[0] = 100;
        System.out.println(a[0]); //--> 100

        int[][] b;
        b = new int[3][2];
        System.out.println(b); // [[I@3ac3fd8b
        System.out.println(b[0]);// [I@5594a1b5
        b[0][1] = 100;
        System.out.println(b[0][1]); // 100
    }
}
