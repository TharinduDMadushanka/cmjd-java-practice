package Basics;

// Relational operators in Java

class Q9{
    public static void main(String args[]){
        int a = 100, b= 100, c = 99;
        System.out.println(a > b); // false
        System.out.println(a >= b); // true
        System.out.println(a < b); // false
        System.out.println(a <= b); // true

        System.out.println(a > c); // true
        System.out.println(a >= c); // true
        System.out.println(a < c); // false
        System.out.println(a <= c); // false

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a != b); // false
        System.out.println(a != c); // true
    }
}

