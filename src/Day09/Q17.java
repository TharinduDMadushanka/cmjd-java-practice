package Day09;

class Q17 {
    public static int y = 100;

    public static void main(String[] args) {
        int x = 200;
        print();
    }
    public static void print(){
        //System.out.println("Local : " + x); // Illegal, Local variable-> main
        System.out.println("Global : " + y); // Legal, Global Variable
    }
}

