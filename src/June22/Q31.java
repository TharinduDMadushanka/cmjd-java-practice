package June22;

/**
 * pass sub classes
 * we can create Number class object or related to Number
 */

class List<T extends Number>{ // Type Parameter for Class
    private T[] items = (T[])new Object[10];
    private int count = 0;

    public void add(T item){
        items[count] = item;
        count++;
    }

    public T get(int index){
        return items[index];
    }
}

class Customer{}

class Example31 {
    public static void main(String args[]) {
        List<Number> numberList = new List<>();
        List<Integer> integerList = new List<>();
        List<Double> doubleList = new List<>();

        // List<Customer> custList = new List<>(); // Illegal
    }
}
