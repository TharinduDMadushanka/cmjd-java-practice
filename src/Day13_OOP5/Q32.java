package Day13_OOP5;

/**
 *(Lambda Expression)
 */
interface Math{
    public int operation(int num1, int num2);
}

class Example {
    public static void main(String[] args) {
        int a = 100, b = 50;
        int result;

        Math add = (num1, num2) -> num1+ num2;
        Math sub = (num1, num2) -> num1- num2;
        Math div = (num1, num2) -> num1/ num2;
        Math mul = (num1, num2) -> num1* num2;

        System.out.println(a + " + " + b + " = " + add.operation(a, b));
        System.out.println(a + " - " + b + " = " + sub.operation(a, b));
        System.out.println(a + " / " + b + " = " + div.operation(a, b));
        System.out.println(a + " * " + b + " = " + mul.operation(a, b));
    }
}
