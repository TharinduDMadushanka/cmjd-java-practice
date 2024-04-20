package Day08;

public class Q6 {
    public static void main(String[] args) {
        int x,y,z;
//        System.out.println(x+" "+y+" "+z); ---> Error variable not initialize

        int [] xr=new int[3];
        System.out.println(xr[0]+" "+xr[1]+" "+xr[2]); // Print 0 0 0 ---> default values
                                                        // xr not initialize but not give an Error because when we crete an Array default value will initialize
    }                                                  //with respective data type
}
