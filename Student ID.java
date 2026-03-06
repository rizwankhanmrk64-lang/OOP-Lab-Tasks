class Student {

    int id;
    String name;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Ali";

        s1.display();
    }
}