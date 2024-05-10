package Assingment_04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int soap=100;
        int pCount;

        do {
            Scanner input = new Scanner(System.in);

            System.out.print("How many soap do you want:");
            pCount = input.nextInt();

            int bill = pCount * soap;

            if (bill >= 1500) {
                System.out.println("You are entitled to the super draw");
            } else {
                System.out.println("try again");
            }
        }while (pCount!=0);
    }
}
