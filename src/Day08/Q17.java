// Illegal case 2
package Day08;

class Q17 {
    public static void main(String[] args) {
        int[] ar = {1,2,4,6,8,3,6,4,5,6,7,2,1} ;

        for(int a : ar){
            System.out.println(a);
        }

        //System.out.println(a);  ---> Illegal, can't access outside the block
    }
}

