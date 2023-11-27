package main.lesson20231127.example5;

public class CPU {
    private int numOfCores;

    public CPU(int numOfCores){
        this.numOfCores = numOfCores;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "numOfCores=" + numOfCores +
                '}';
    }
}
