// Print elements in a array
package Day08;

class Q9 {
    public static void main(String[] args) {
        int [] marks = {67,35,67,89,78,69,85,67,80,45,77,80,90,91,34,56};

        System.out.println("Las Element : "+marks[marks.length - 1]); // Get last element of an Array
        System.out.println("Middle Element : "+marks[+marks.length/2]); // Get middle element of an Array

        // print marks
        System.out.print("[");
        for(int i = 0; i< marks.length; i++){
            System.out.print(marks[i] + ", "); //prints---> [67, 35, 67, 89, 78, 69, 85, 67, 80, 45, 77, 80, 90, 91, 34, 56]
        }
        System.out.println("\b\b]");
    }
}

