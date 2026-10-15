package sahana;

class Employee {
    int empId = 101;
    String name = "Rahul";
    double salary = 25000;

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class exp7 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
