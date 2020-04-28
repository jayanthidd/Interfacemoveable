package org.campus02.zam.ss2020;

public class Shirt implements Moveable {
    String brand;
    Color shirtcolor;
    int size;

    public Shirt(String brand, Color shirtcolor, int size) {
        this.brand = brand;
        this.shirtcolor = shirtcolor;
        this.size = size;
    }

    @Override
    public void move(String destination) {
        System.out.println(shirtcolor + " " + brand + " will be moved to " + destination);
    }
}
