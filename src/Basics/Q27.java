package Basics;

//State as Attributes

// ------------------ Student.java -----------------
class Student{
    // ----- Start Attribute Declaration
    String id;
    String name;
    int sub1;
    int sub2;
    // ----- End Attribute Declaration
}

// ------------------ Example.java -----------------
class Q27 {
    public static void main(String[] args) {
        Student s1; //Create reference Variable for type "Student"
        s1 = new Student(); // Create an Object "Student" and initialize to s1

        s1.id = "S001";
        s1.name = "Student 1";
        s1.sub1 = 85;
        s1.sub2 = 80;

        Student s2 = new Student();

        s2.id = "S002";
        s2.name = "Student 2";
        s2.sub1 = 78;
        s2.sub2 = 90;

        System.out.println("id of s1 : " + s1.id);
        System.out.println("name of s1 : " + s1.name);
        System.out.println("sub1 of s1 : " + s1.sub1);
        System.out.println("sub2 of s1 : " + s1.sub2);

        System.out.println("id of s2 : " + s2.id);
        System.out.println("name of s2 : " + s2.name);
        System.out.println("sub1 of s2 : " + s2.sub1);
        System.out.println("sub2 of s2 : " + s2.sub2);
    }
}
