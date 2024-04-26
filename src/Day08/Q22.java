package Day08;

//Variable Length Arguments (var-args)
//Steps 5

public class Q22 {
    public static void main(String[] args) {
        printTotal(10, 20); // 10 + 20 = 30
        printTotal(10, 20, 30); // 10 + 20 + 30 = 60
        printTotal(10, 20, 30, 40); // 10 + 20 + 30 + 40 = 100
    }
    public static void printTotal(int... a){ // int[] a  == int... a --->(var-args)
        int tot=0;
        for (int i:a){
            System.out.print(i+"+");
            tot+=i;
        }
        System.out.println("\b= "+tot);
    }
}
