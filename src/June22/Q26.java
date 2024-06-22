package June22;

/**
 * GENERICS IN JAVA
 */

class List{
    private int[] items = new int[10];
    private int count = 0;

    public void add(int item){
        items[count] = item;
        count++;
    }

    public int get(int index){
        return items[index];
    }
}
class Example26 {
    public static void main(String args[]) {
        List list = new List();
        list.add(100);
        System.out.println(list.get(0));
    }
}
