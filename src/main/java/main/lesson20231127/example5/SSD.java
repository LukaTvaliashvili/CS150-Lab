package main.lesson20231127.example5;

public class SSD {
    private double capacity;

    public SSD(double capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "capacity=" + capacity +
                '}';
    }
}
