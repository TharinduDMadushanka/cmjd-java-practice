package Basics;

// Java Random numbers

import java.util.Random;
import java.util.Scanner;

class Q17{
    public static void main(String args[]){
        // Scanner input = new Scanner(System.in);
        // System.out.print("Input number : ");

        Random input = new Random(); // Random Numbers

        int num = input.nextInt(); // min to max int range
        System.out.println("Number : " + num);
    }
}

