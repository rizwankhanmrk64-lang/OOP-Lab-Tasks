
class Employee {
    String name;
    double salary;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
    }
}


class Manager extends Employee {
    double bonus;

    void calculateTotalSalary() {
        double total = salary + bonus;
        displayEmployee(); // parent method
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + total);
    }
}

// Main class
public class Employesallerysystem {
    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.name = "Ali";
        m1.salary = 50000;
        m1.bonus = 10000;

        m1.calculateTotalSalary();
    }
}