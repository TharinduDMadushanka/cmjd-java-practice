package Day09_Multidimensional_Arrays;

class Q15 {
    public static void main(String[] args) {
        int[][] br = {{1,2},{10,20,30,40}, {100, 200, 300}};

        for(int i = 0; i < br.length; i++){
            for(int j = 0; j < br[i].length; j++){
                System.out.print(br[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
