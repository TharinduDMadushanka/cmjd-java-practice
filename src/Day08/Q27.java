package Day08;

import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        double[] salary = {10000.0, 20000.0, 300000.0, 500000.0};
        System.out.println(Arrays.toString(salary));

        increment(salary, 20); // 20 -> 20% (rate)
        System.out.println(Arrays.toString(salary));

    }
    public static void increment(double[] ar,int rate){
        for (int i=0;i<ar.length;i++){
            ar[i]*=(rate+100)/100.0;
        }
    }
}
