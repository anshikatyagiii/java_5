class Pharmacy {
    String pharmacyName;
    String location;

    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    void displayPharmacyCount() {
        System.out.println("Total Pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {

        Pharmacy p1 = new Pharmacy("Health Care", "Dehradun");
        Pharmacy p2 = new Pharmacy("Medico", "Haridwar");
        Pharmacy p3 = new Pharmacy("City Pharmacy", "Rishikesh");

        p1.displayPharmacy();
        System.out.println();

        p2.displayPharmacy();
        System.out.println();

        p3.displayPharmacy();
        System.out.println();

        p1.displayPharmacyCount();
    }
}