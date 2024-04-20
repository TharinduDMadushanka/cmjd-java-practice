package Day08;

public class Q4 {
    public static void main(String[] args) {
        int x;
        x=100;
        System.out.println(x);

        int[] xr; // xr ---> Array reference variable === crate Array reference [array declaration]
        xr= new int[5];// Create array object --> [Array construction]
        System.out.println(xr); // in here prints xr reference address

        xr[1]=100; // Array initialization
        System.out.println(xr[1]); //prints 1 st index of array xr
    }
}
