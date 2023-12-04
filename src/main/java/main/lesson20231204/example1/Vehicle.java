package main.lesson20231204.example1;

//Parent class
public class Vehicle {

    private String brand;
    private int releaseDate;

    public Vehicle(){
        System.out.println("Vehicle Constructor");
    }
    public Vehicle(String brand, int releaseDate){
        this.brand = brand;
        this.releaseDate = releaseDate;
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Date of release: " + this.releaseDate);
    }
}
