// Legal and Illegal conversion
package Day08;

class Q11 {
    public static void main(String[] args) {
        int xr[] = new int[5];
        double dr[] = new double[5];

        dr[0] = xr[0]; // Legal - Wider Conversion
        //xr[0] = dr[0]; // Illegal -> Narrow
        xr[0] = (int)dr[0]; // Legal --> Narrow Casting

//        xr = dr; // Illegal
//        dr = xr; // Illegal
    }
}
