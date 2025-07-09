# Activity 1: Implementing Inheritance and Method Overriding (OOP Java)
## Project Description
This project is a simple Java program focused on the fundamental concepts of Object-Oriented Programming (OOP): **Inheritance** and **Method Overriding**. Its purpose is to understand the hierarchical relationships between classes and how method behavior can be customized in subclasses.
The program creates a `Vehiclee` superclass and three specific subclasses: `Carr` (Car), `Motorcyclee` (Motorcycle), and `Truckk` (Truck). Each subclass overrides the `move()` method from the superclass to demonstrate unique movement behavior specific to its vehicle type.
*(Please note: Some parts of the codebase, including variable names, are written in Indonesian for clarity among local developers.)*
## OOP Concepts Utilized
* **Inheritance**
    * The `Carr`, `Motorcyclee`, and `Truckk` classes are subclasses that inherit attributes (`brand`, `model`, `year`) and methods (`move()`, `displayInfo()`) from the `Vehiclee` superclass. This promotes code        reuse and establishes "is-a" relationships (e.g., a Car is a Vehicle).
* **Method Overriding**
    * Each subclass (`Carr`, `Motorcyclee`, `Truckk`) provides its own specific implementation for the `move()` method, overriding the default behavior from the `Vehiclee` class. This demonstrates how subclasses       can modify inherited behavior to suit their needs.
* **Encapsulation (Implicit)**
    * While attributes in the `Vehiclee` class use `protected`, objects are still managed through constructors and methods, which forms the basis of encapsulation. Subclass-specific attributes use `private`.
## Class Structure
This project consists of several Java classes representing the vehicle hierarchy:
### `Vehiclee.java`
* **Purpose:** The superclass representing the basic properties and behaviors of all types of vehicles.
* **Attributes:** `brand` (String), `model` (String), `year` (int).
* **Constructor:** `public Vehiclee(String brand, String model, int year)`
* **Methods:**
    * `public void move()`: Displays a general vehicle movement message.
    * `public void displayInfo()`: Displays basic vehicle information.
### `Carr.java`
* **Purpose:** Represents a car vehicle type.
* **Inherits from:** `Vehiclee`
* **Additional Attributes:** `numberOfDoors` (int).
* **Constructor:** `public Carr(String brand, String model, int year, int numberOfDoors)`
* **Overridden Method:**
    * `@Override public void move()`: Displays a car-specific movement message ("melaju di jalan raya").
* **Additional Method:** `public void honk()`: Simulates honking.
### `Motorcyclee.java`
* **Purpose:** Represents a motorcycle vehicle type.
* **Inherits from:** `Vehiclee`
* **Additional Attributes:** `hasSideCar` (boolean).
* **Constructor:** `public Motorcyclee(String brand, String model, int year, boolean hasSideCar)`
* **Overridden Method:**
    * `@Override public void move()`: Displays a motorcycle-specific movement message ("melaju dengan gesit").
* **Additional Method:** `public void wheelie()`: Simulates performing a wheelie.
### `Truckk.java`
* **Purpose:** Represents a truck vehicle type.
* **Inherits from:** `Vehiclee`
* **Additional Attributes:** `cargoCapacity` (double).
* **Constructor:** `public Truckk(String brand, String model, int year, double cargoCapacity)`
* **Overridden Method:**
    * `@Override public void move()`: Displays a truck-specific movement message ("bergerak membawa muatan").
* **Additional Method:** `public void loadCargo()`: Simulates loading cargo.
### `Main.java`
* **Purpose:** The entry point of the program. Demonstrates the functionality of each vehicle class.
* **Main Content:**
    * Creates instances of `Carr`, `Motorcyclee`, and `Truckk`.
    * Calls `displayInfo()` for each vehicle.
    * Calls `move()` for each vehicle (demonstrating overriding).
    * Calls specific subclass methods (`honk()`, `wheelie()`, `loadCargo()`).
## Project Structure
This project is organized with a standard Java folder structure:
```
.
├── src/
│   ├── Vehiclee.java
│   ├── Carr.java 
│   ├── Motorcyclee.java
│   ├── Truckk.java
│   └── Main.java
└── README.md
```
## Usage Example (Console Output)
Here is an example of the program output in the console when executed:
```
Merk: Ferrari, Model: VC1, Tahun: 2026
Merk: Honda, Model: CBR500R, Tahun: 2021
Merk: Hino, Model: Dutro, Tahun: 2020

Aksi kendaraan:
Mobil Ferrari VC1 melaju di jalan raya
Motor Honda CBR500R melaju dengan gesit
Truk Hino Dutro bergerak membawa muatan
Tin tin!
Motor melakukan wheelie!
Memuat barang dengan kapasitas 5.0 ton
```
## How to Run the Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files**
    Ensure all `.java` files are located in the `src/` folder within your project directory.
2.  **Compile Code**
    Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/` and `README.md` are located), and compile all Java files:
    ```
    javac src/*.java
    ```
3.  **Run the Program**
    Once successfully compiled, you can run the program:
    ```
    java -cp src Main
    ```
## Important Notes and Potential Enhancements
* **Class Naming Convention:** The class names such as `Vehiclee`, `Carr`, `Motorcyclee`, and `Truckk` deviate from standard Java naming conventions (which typically use singular nouns and start with an uppercase letter, e.g., `Vehicle`, `Car`, `Motorcycle`, `Truck`). Adhering to these conventions would improve code readability and maintainability for future development.
* **Further Encapsulation:** Attributes using `protected` in `Vehiclee` (like `brand`, `model`, `year`) could be made `private` and accessed through `public` getter methods (`getBrand()`, `getModel()`, `getYear()`) for stricter encapsulation and better control over data access.
* **Polymorphism Demonstration:** To demonstrate polymorphism more explicitly, one could create an array or `List` of type `Vehiclee` and store various `Carr`, `Motorcyclee`, or `Truckk` objects within it. Then, iterating through the list and calling the `move()` method on each `Vehiclee` object would showcase how the correct overridden method is invoked at *runtime*.
* **Additional Functionality:** The functionality of each vehicle could be expanded by adding more methods (e.g., `refuel()`, `startEngine()`, `checkTirePressure()`), or by introducing new attributes that define more complex behaviors.
