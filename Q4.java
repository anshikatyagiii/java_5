class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println(
            "ID: " + patientId +
            ", Name: " + patientName +
            ", Age: " + age
        );
    }
}

class PatientManager {

    void displayAllPatients(Patient[] patients) {

        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {

        Patient[] patients = new Patient[5];

        patients[0] = new Patient(1, "Rahul", 25);
        patients[1] = new Patient(2, "Priya", 30);
        patients[2] = new Patient(3, "Aman", 22);
        patients[3] = new Patient(4, "Neha", 28);
        patients[4] = new Patient(5, "Riya", 35);

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}