package Day12_OOP4;

class Customer{
    private int code;
    private String name;

    public Customer(int code, String name){
        this.code = code;
        this.name = name;
    }

    // public String toString(){
    //     int hashCode = hashCode();
    //     String hex = Integer.toHexString(hashCode);
    //     return getClass().getName() + "@" + hex;
    // }
    public String toString(){
        return this.code + "-" + this.name;
    }
}

class Q15 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        System.out.println(c1.toString()); // 1001-Customer 1
    }
}
