package Assingment_04; /**
 * Enter the unit price and amount bought from a product. Calculate the total.
 * If the total is greater than Rs.1500/- display “You are entitled to the super draw. Otherwise display “try again”.
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int soap=100;
        int pCount;
        int totalBill;

        do {
            Scanner input = new Scanner(System.in);

            System.out.print("How many soap do you want:");
            pCount = input.nextInt();

            int bill = pCount * soap;

            if (bill >= 500) {
                totalBill= (int) (bill-(bill*0.05));
                System.out.println("Total bill with discount ->"+totalBill);
            } else {
                System.out.println("No discount");
            }
        }while (pCount!=0);
    }
}
