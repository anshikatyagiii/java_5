class Hospital {

    // Public members can be accessed directly.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "CH101";
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {

        Hospital h = new Hospital();

        h.hospitalName = "City Care Hospital";
        h.hospitalCode = "CCH202";

        System.out.println(h.hospitalName);
        System.out.println(h.hospitalCode);

        h.displayHospital();
    }
}