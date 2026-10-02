class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    static int employeeCount = 0;

    // Protected member used by child classes.
    protected String department;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {

        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
        this.department = "Pharmacy";
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("License No: " + licenseNo);
    }
}

class StoreManager extends Employee {

    private int storeSection;

    StoreManager(int employeeId, String employeeName,
                 double salary, int storeSection) {

        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
        this.department = "Store";
    }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Store Section: " + storeSection);
    }
}

class PharmacyManager {

    void processEmployees(Employee[] employees) {

        int total = 0; // Local variable.

        for (int i = 0; i < employees.length; i++) {

            total++;

            if (employees[i] instanceof Pharmacist) {

                Pharmacist p = (Pharmacist) employees[i];
                p.displayPharmacist();

            } else if (employees[i] instanceof StoreManager) {

                StoreManager s = (StoreManager) employees[i];
                s.displayStoreManager();
            }

            System.out.println();
        }

        System.out.println("Employees Processed: " + total);
        System.out.println("Total Employee Objects: "
                + Employee.employeeCount);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {

        Employee[] employees = {
            new Pharmacist(101, "Rahul", 40000, "LIC101"),
            new StoreManager(102, "Amit", 45000, 5)
        };

        PharmacyManager manager = new PharmacyManager();

        manager.processEmployees(employees);
    }
}