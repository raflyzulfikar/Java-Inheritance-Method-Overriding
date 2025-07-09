public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void move() {
        System.out.println("Truk " + brand + " " + model + " bergerak membawa muatan");
    }

    public void loadCargo() {
        System.out.println("Memuat barang dengan kapasitas " + cargoCapacity + " ton");
    }
}