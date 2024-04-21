package Basics;

// Behavior as Instance Method

// ------------------ Student.java -----------------
class Student1{
    // ----- Start Attribute Declaration
    String id;
    String name;
    int sub1;
    int sub2;
    // ----- End Attribute Declaration

    // ------ Start Method Declaration

    public void setValues(String stuId, String stuName, int stuSub1, int stuSub2){
        id = stuId;
        name = stuName;
        sub1 = stuSub1;
        sub2 = stuSub2;
    }

    // ------ End Method Declaration
}

// ------------------ Example.java -----------------
class Q28 {
    public static void main(String[] args) {
        Student1 s1; //Create reference Variable for type "Student"
        s1 = new Student1(); // Create an Object "Student" and initialize to s1

        s1.setValues("S001", "Student 1", 85, 80);
        // s1.id = "S001";
        // s1.name = "Student 1";
        // s1.sub1 = 85;
        // s1.sub2 = 80;

        Student1 s2 = new Student1();
        s2.setValues("S002", "Student 1", 78, 90);

        // s2.id = "S002";
        // s2.name = "Student 2";
        // s2.sub1 = 78;
        // s2.sub2 = 90;

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

