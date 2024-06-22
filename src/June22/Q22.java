package June22;

enum Color{
    RED, GREEN, BLACK, BLUE;// Enum ObjectsS
}

class Example22 {
    public static void main(String args[]) {
        Color color = Color.GREEN;

        switch (color) { // Legal
            case RED:
                break;
            case GREEN:
                break;
            case BLACK:
                break;
            case BLUE:
                break;
            default:
                break;
        }
    }
}

