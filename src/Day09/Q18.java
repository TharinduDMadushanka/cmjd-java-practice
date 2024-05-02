package Day09;

class Q18 {
    public static int y = 100;

    public static void main(String[] args) {
        int x = 200;
        increment(x);
        increment(x);
        increment(x);
        increment(x);

        System.out.println(x);
        System.out.println(y);
    }

    public static void increment(int x){
        x++; // not increment because this not return
        y++;
    }

}
