// char type Arrays default value
package Day08;

class Q7 {
    public static void main(String[] args) {
        char[] xr = new char[3];
        System.out.println(xr[0] + " " + xr[1] + " " + xr[2]); // prints nothing
        System.out.println("ASCII : " + (int) xr[0]);  // convert xr[0] value in to int type
    }                                                  // ASCII : 0 (means null)
}
