class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    private int employeeId;
    private double salary;

    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
}

class Doctor extends Employee {

    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {

        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Salary: " + getSalary());
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {

        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Pharmacist: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Salary: " + getSalary());
        System.out.println("License No: " + licenseNo);
    }
}

class StaffManager {

    void displayStaff(Employee[] staff) {

        for (int i = 0; i < staff.length; i++) {

            if (staff[i] instanceof Doctor) {

                Doctor d = (Doctor) staff[i];
                d.displayDoctor();

            } else if (staff[i] instanceof Pharmacist) {

                Pharmacist p = (Pharmacist) staff[i];
                p.displayPharmacist();
            }

            System.out.println();
        }
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {

        Employee[] staff = {
            new Doctor("Amit", 35, 101, 60000, "Cardiology"),
            new Pharmacist("Rahul", 28, 102, 40000, "LIC101")
        };

        StaffManager manager = new StaffManager();

        manager.displayStaff(staff);

        System.out.println("Total Employees: " +
                Employee.employeeCount);
    }
}