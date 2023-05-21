package Lesson6;

public class NoteBook {
    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private double price;

    public NoteBook(String brand, int ram, int hdd, String os, String color, double price) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

}
