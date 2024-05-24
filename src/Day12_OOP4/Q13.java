package Day12_OOP4;

/**
 * Method “public String toString()”
 */

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
}

class Q13 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        System.out.println(c1); // Compiler inserts "toString()"
        System.out.println(c1.toString());
    }
}
