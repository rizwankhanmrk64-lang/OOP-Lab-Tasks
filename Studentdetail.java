
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNo;

    void displayStudent() {
        displayInfo(); 
        System.out.println("Roll No: " + rollNo);
    }
}


class Teacher extends Person {
    String subject;

    void displayTeacher() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}


public class Studentdetail {
    public static void main(String[] args) {

        // Student object
        Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 20;
        s1.rollNo = 101;

        System.out.println("Student Details:");
        s1.displayStudent();

        System.out.println("-------------------");

        // Teacher object
        Teacher t1 = new Teacher();
        t1.name = "Ahmed";
        t1.age = 35;
        t1.subject = "Math";

        System.out.println("Teacher Details:");
        t1.displayTeacher();
    }
}