package main.lesson20231127.example5;

public class Monitor {
    private String resolution;
    private double screenSize;

    public Monitor(String resolution, double screenSize){
        this.resolution = resolution;
        this.screenSize = screenSize;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
