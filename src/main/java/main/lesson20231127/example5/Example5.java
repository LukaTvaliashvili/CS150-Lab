package main.lesson20231127.example5;

public class Example5 {

    public static void main(String[] args) {
        Computer computer = new Computer(new CPU(12),
                new SSD(512),
                new Monitor("UHD", 27.5),
                new RAM(16));
        System.out.println(computer);
    }
}
