package Basics;

// Constructors

class Box {
    int length;
    int width;
    int height;

    Box(int length, int width, int height){ // No Return Type, Must be class name
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setValue(int length, int width, int height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void printVolume() {
        int volume; // Local Variable
        volume = length * height * width;
        System.out.println("Volume of the box : " + volume);
    }

    public int getVolume() {
        int volume; // Local Variable
        volume = length * height * width;
        return volume;
    }
}

class Q29 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 6, 5);
        b1.printVolume();

        //Box b2 = new Box(); // Illegal
        //b2.printVolume();
    }
}
