package Day09;

class Q16 {
    public static int x = 100;
    public static void main(String[] args) {
        int x = 200;
        System.out.println("Local x : " + x);
        System.out.println("Global x : " + Q16.x); // Global var can access by their class name
    }
}

