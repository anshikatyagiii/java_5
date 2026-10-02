class Patient {

    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
            System.out.println("Age updated successfully.");
        } else {
            System.out.println("Invalid age.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
            System.out.println("Weight updated successfully.");
        } else {
            System.out.println("Invalid weight.");
        }
    }

    void displayPatient() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {

        Patient p = new Patient("Anshika", 22, 55.5);

        p.setAge(23);
        p.setAge(-5);

        p.setWeight(57.0);
        p.setWeight(-10);

        p.displayPatient();
    }
}