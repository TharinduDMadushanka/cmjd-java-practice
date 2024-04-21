package Basics;

//  Returning an Object

class Box1 {
    int length;
    int width;
    int height;

    Box1(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void printVolume() {
        int volume;
        volume = length * height * width;
        System.out.println("Volume of the box : " + volume);
    }

    public Box1 getCopy(){
        Box1 box = new Box1(length, width, height);
        return box;
    }
}

class Q31 {
    public static void main(String[] args) {
        Box1 b1 = new Box1(10, 5, 6);
        b1.printVolume(); // 300

        Box1 b2 = b1.getCopy();
        b2.printVolume(); // 300

        System.out.println(b1 == b2);
    }
}

