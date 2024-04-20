package Day08;

public class Q8 {
    public static void main(String[] args) {
        // ================ Method 1 ================

        int [] ar = new int[3];
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]); //prints 0 0 0

//        int [] ar = new int[]; ---> this should be an Error size should

        // ================ Method 2 ================

        int [] cr ={10,20,30};
        System.out.println(cr[0]+" "+cr[1]+" "+cr[2]); // Prints 10, 20, 30

        int [] dr;
        //dr={10,20,30}; -->Illegal

        int er[];
        er=new int[]{10,20,30}; //---> Legal
    }
}
