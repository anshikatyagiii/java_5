class Pharmacy {

    // Default/package-private members.
    String medicineName;
    double price;

    // Default constructor.
    Pharmacy() {
        medicineName = "Paracetamol";
        price = 50;
    }

    // Default/package-private method.
    void displayMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {

        Pharmacy p = new Pharmacy();

        // Both classes are in the same package.
        System.out.println(p.medicineName);
        System.out.println(p.price);

        p.displayMedicine();
    }
}