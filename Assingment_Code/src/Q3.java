/**
 * Enter marks Obtained by a student for Chemistry, Physics and Combined math. Calculate the total and average.
 * If the average is greater than 75 then display “Pass” otherwise “Fail”. Write a java program to perform the above task.
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Chemistry marks: ");
        double chem = input.nextDouble();
        System.out.print("Enter Physics marks: ");
        double phy = input.nextDouble();
        System.out.print("Enter C. Maths marks: ");
        double math = input.nextDouble();

        double total = chem + phy + math;
        double avg = total / 3;

        if (avg>=75){
            System.out.println("Your avg is "+avg+"\nPASS");
        }else {
            System.out.println("Your avg is "+avg+"\nFAIL");
        }
    }
}
