package main.lesson20231204.example1;

public class Example1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Generic Vehicle", 2020);
        Car car = new Car("Toyota", 2022, 4);
        vehicle.displayInfo();
        car.displayInfo();
    }
}
