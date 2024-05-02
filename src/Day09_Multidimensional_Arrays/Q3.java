package Day09_Multidimensional_Arrays;

class Q3 {

    public static void main(String[] args) {
        Student[] studentAr = new Student[5];
        studentAr[0] = new Student(1, "Student 1", 78, 56);
        studentAr[1] = new Student(2, "Student 2", 56, 98);
        studentAr[2] = new Student(3, "Student 3", 58, 86);
        studentAr[3] = new Student(4, "Student 4", 21, 57);
        studentAr[4] = new Student(5, "Student 5", 98, 78);

        for (Student student : studentAr) {
            student.print();
        }
    }
}

class Student{
    int id;
    String name;
    int sub1;
    int sub2;

    Student(int id, String name, int sub1, int sub2){
        this.id = id;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void print(){
        System.out.println(id + " " + name + " " + sub1+ " " + sub2);
    }
}