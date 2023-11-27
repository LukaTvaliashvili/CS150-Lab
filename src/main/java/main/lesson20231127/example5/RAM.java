package main.lesson20231127.example5;

public class RAM {
    private double capacity;

    public RAM(double capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                '}';
    }
}
