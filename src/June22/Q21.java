package June22;

enum Color{
    RED, GREEN, BLACK, BLUE;// Enum ObjectsS
}

class Example21 {
    public static void main(String args[]) {
        Color[] colors = Color.values();
        for(Color color : colors){
            System.out.println(color);
        }
    }
}
