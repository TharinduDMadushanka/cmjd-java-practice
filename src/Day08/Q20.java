package Day08;

//Variable Length Arguments (var-args)
//Steps 1,2,3,4

public class Q20 {
    public static void main(String[] args) {
        printTotal(10, 20); // 10 + 20 = 30
        printTotal(10, 20, 30); // 10 + 20 + 30 = 60
    }
    public static void printTotal(int a,int b){
        int total=a+b;
        System.out.println(a + " + " + b + " = " + total);
    }
    public static void printTotal(int a,int b,int c){
        int total=a+b+c;
        System.out.println(a + " + " + b + " + " +c +" = " + total);
    }
}
