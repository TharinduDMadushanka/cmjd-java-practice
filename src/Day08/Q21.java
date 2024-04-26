package Day08;

//Variable Length Arguments (var-args)
//Steps 5

public class Q21 {
//    public static void main(String[] args) { // give an erro
//        printTotal(10, 20); // 10 + 20 = 30
//        printTotal(10, 20, 30); // 10 + 20 + 30 = 60
//        printTotal(10, 20, 30, 40); // 10 + 20 + 30 + 40 = 100
//    }
    public static void printTotal(int[] a){
        int tot=0;
        for (int i:a){
            System.out.println(i+"+");
            tot+=i;
        }
        System.out.println("\b\b= "+tot);
    }
}
