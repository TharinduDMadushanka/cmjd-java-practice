package Day12_OOP4;

/**
 * Method “public boolean equals(Object)”
 */

class Customer{
    private int code;
    private String name;

    public Customer(int code, String name){
        this.code = code;
        this.name = name;
    }

    public String toString(){
        return this.code + "-" + this.name;
    }
}

class Q16 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        Customer c2 = new Customer(1001, "Customer 1");

        System.out.println("c1 == c2 : " + (c1==c2)); // false beacuse there are 2 objects (references)
    }
}

