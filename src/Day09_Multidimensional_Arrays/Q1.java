package Day09_Multidimensional_Arrays;

/**
 * Object Arrays
 */

class Q1 {

    public static void main(String[] args) {
        int [] ar = new int[5];
        Student1[] studentAr = new Student1[5]; // create object array

        System.out.println(studentAr[1]); //---> null
    }
}

class Student1{
    int id;
    String name;
    int sub1;
    int sub2;
}
