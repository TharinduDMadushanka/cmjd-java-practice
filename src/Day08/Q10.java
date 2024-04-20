//array index out of bound exception
package Day08;

public class Q10 {
    public static void main(String[] args) {
        int[] ar = {10, 20, 30};
        System.out.println("ar[0] :"+ar[0]);
        System.out.println("ar[1] :"+ar[1]);
        System.out.println("ar[2] :"+ar[2]);

//        System.out.println("ar[3] :"+ar[3]); ---> Compiled (Legal Statement) but give Run time Error (array index out of bound exception)
    }
}
