package Basics;

class Q10{
    public static void main(String args[]){
        int x = 100, y = 99;
        System.out.println(x == y); // false
        System.out.println(x != y ); // true

        System.out.println(x = y); // 99

        System.out.println(x == y); // true
        System.out.println(x != y ); // false

    }
}

