package main.lesson20231204.example1;

//Car inherits from vehicle
public class Car extends Vehicle {
    private int numberOfDoors;

    // this - refers to the instance of the current class
    // this() - refers to the constructor of the current instance
    // super - refers to the parent instance
    // super() - refers to the constructor of the parent instance
    public Car() {
        super();
    }

    public Car(String brand, int releaseDate, int numberOfDoors) {
        super(brand, releaseDate);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
