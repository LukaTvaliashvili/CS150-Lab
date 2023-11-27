package main.lesson20231127.example5;

public class Computer {
    private CPU cpu;
    private SSD ssd;
    private Monitor monitor;
    private RAM ram;

    public Computer(CPU cpu, SSD ssd, Monitor monitor, RAM ram) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.monitor = monitor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ssd=" + ssd +
                ", monitor=" + monitor +
                ", ram=" + ram +
                '}';
    }
}
