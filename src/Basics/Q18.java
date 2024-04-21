package Basics;

// Random numbers with bound

import java.util.Random;

class Q18{
    public static void main(String args[]){

        Random input = new Random(); // Random Numbers

        for(int i = 0; i < 20; i++){
            int num = input.nextInt(10) + 1; // 1 to 10 range
            System.out.println("Number : " + num);
        }
    }
}
