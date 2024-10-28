
class Employee {
    protected String name;
    protected double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}


class Manager extends Employee {
    private String department;


    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}


public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Alice", 50000);
        emp.displayDetails();

        System.out.println();


        Manager mgr = new Manager("Bob", 75000, "Sales");
        mgr.displayDetails();
    }
}

