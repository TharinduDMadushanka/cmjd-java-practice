package Day08;

class Q18 {
    public static void main(String[] args) {
        int[] ar = {1,2,4,6,8,3,6,4,5,6,7,2,1} ;

        for(long a : ar){ // Legal
            System.out.print(a + " ");
        }

//        for(byte a : ar){  ---->  Illegal (narrow casting)
//            System.out.print(a + " ");
//        }
    }
}
