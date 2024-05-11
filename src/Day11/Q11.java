package Day11;

public class Q11 {
    public static void main(String[] args) {

        BB b1 = new BB();

        b1.callPrint();
        b1.printAB();

    }
}

class A4 {
    int a;
    public void printA(){
        System.out.println("a : " + a);
    }
}

class BB extends A4 {
    int b;
    public void printB(){
        System.out.println("b : " + b);
    }

    public void printAB(){
        System.out.println("a : " + a); // from A
        System.out.println("b : " + b);
    }

    public void callPrint(){
        printA(); // from A
        printB();
    }
}
