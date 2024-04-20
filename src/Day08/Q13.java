package Day08;

public class Q13 {
    public static void main(String[] args) {
        int [] ar={100,200,300};
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
        //increment(ar[0],ar[1],ar[2]);// Nothing happen for value in ar array
        increment(ar);
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
    }
//    public static void increment(int a, int b, int c){ // Wrong way
//        a++;
//        b++;
//        c++;
//    }
    public static void increment(int [] ar){ // Correct way to increment method
        ar[0]++;
        ar[1]++;
        ar[2]++;
    }
}
