class Student {
    String name;
    int rollNo;
    double marks;

    Student() {
        name = "Anshika";
        rollNo = 101;
        marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {

        Student s = new Student();
        s.displayDetails();
    }
}