public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021, false);
        Truck truck = new Truck("Hino", "Dutro", 2020, 5.0);

        car.displayInfo();
        motorcycle.displayInfo();
        truck.displayInfo();

        System.out.println("\nAksi kendaraan:");
        
        car.move();
        motorcycle.move();
        truck.move();

        car.honk();
        motorcycle.wheelie();
        truck.loadCargo();
    }
}