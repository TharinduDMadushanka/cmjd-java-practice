//Exercise
package Day08;


import java.util.Random;
import java.util.Scanner;

class Q14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input No of Students : ");
        final int N = input.nextInt();

        // 1. Create an array to store student's marks, named "marks"
        int marks[] = createAnArray(N);


        // 2. Read and store marks [Read Random number 0 to 100]
        readMarks(marks);

        // 3. Find Total
        int total = findTotal(marks);

        // 4. Find Max
        int max = findMax(marks);

        // 5. Find Min
        int min = findMin(marks);

        // 6. Print Marks
        printMarks(marks); //[ , ,]

        System.out.println("Total : " + total);
        System.out.println("Min : " + min );
        System.out.println("Max : " + max);
    }
    public static int[] createAnArray(int length){
        int[] ar = new int[length];
        return ar;
    }

    public static void readMarks(int ar[]){
        Random random = new Random();
        for(int i = 0; i < ar.length; i++){
            ar[i] = random.nextInt(101);
        }
    }

    public static int findTotal(int[] ar){
        int total = 0;
        for(int i = 0; i < ar.length; i++){
            total += ar[i];
        }
        return total;
    }

    public static int findMax(int[] ar){
        int max = 0;
        for(int i = 0; i < ar.length; i++){
            if(max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }

    public static int findMin(int[] ar){
        int min = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(min > ar[i]){
                min = ar[i];
            }
        }
        return min;
    }

    public static void printMarks(int[] ar){
        System.out.print("[");
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
