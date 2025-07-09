public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void move() {
        System.out.println("Kendaraan bergerak");
    }

    public void displayInfo() {
        System.out.println("Merk: " + brand + ", Model: " + model + ", Tahun: " + year);
    }
}