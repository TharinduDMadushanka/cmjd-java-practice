package Day08;

//Q411 Exercise 2
//print array with converting string

public class Q25 {
    public static void main(String[] args) {
        int[] ar = {56,78,58,89,97,86,78,98,94,75,59,87,89,36,21};
        String s1 = toString(ar);
        System.out.println(s1);
    }
    public static String toString(int[] ar){
        String s="[";
        for (int a:ar){
            s+=a+", ";
        }
        s+="\b\b]";
        return s;
    }
}
