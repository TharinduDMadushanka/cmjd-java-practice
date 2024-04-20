package Day08;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a, b, c, d, e, f, g, h, i, j;

        int[] ar = new int[10]; //---> create int type array

        for (int k = 0; k < 10; k++) {
            System.out.print("Input Number "+(k+1)+ " :");
            ar [k] = scanner.nextInt(); //---> store user input all elements in ar array by using index k
            //System.out.println(ar[k]); //---> print all elements in ar array
        }

        for (int i=0;i<10;i++){
            System.out.println(ar[i]); //---> print all elements in ar array after user inputs
        }


//        System.out.print("[");
//        for(int i = 0; i< 10; i++){
//            System.out.print(ar[i] + ", "); ---> this print like this -> [1, 2, 3, 3, 4, 4, 5, 6, 6, 6]
//        }
//        System.out.println("\b\b]");

    }
}

