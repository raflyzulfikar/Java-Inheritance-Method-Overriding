public class Motorcycle extends Vehicle {
    boolean hasSideCar;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void move() {
        System.out.println("Motor " + brand + " " + model + " melaju dengan gesit");
    }

    public void wheelie() {
        System.out.println("Motor melakukan wheelie!");
    }
}