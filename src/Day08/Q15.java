// For-each Loop
package Day08;

class Q15 {
    public static void main(String[] args) {
        int[] ar = {1,2,4,6,8,3,6,4,5,6,7,2,1} ;
        //Using for loop
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }

        System.out.println();

        // using for each

        for(int a: ar){
            System.out.print(a + " ");
        }
    }
}
