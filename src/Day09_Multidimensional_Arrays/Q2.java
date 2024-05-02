package Day09_Multidimensional_Arrays;

class Q2 {

    public static void main(String[] args) {
        Student2[] studentAr = new Student2[5];
        studentAr[0] = new Student2();
        studentAr[1] = new Student2();
        studentAr[2] = new Student2();
        studentAr[3] = new Student2();
        studentAr[4] = new Student2();

        /**
         * prints references of student objects create in stack
         */

        System.out.println(studentAr[0]);
        System.out.println(studentAr[1]);
        System.out.println(studentAr[2]);
        System.out.println(studentAr[3]);
        System.out.println(studentAr[4]);
    }
}

class Student2{
    int id;
    String name;
    int sub1;
    int sub2;
}
