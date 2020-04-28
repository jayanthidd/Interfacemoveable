package org.campus02.zam.ss2020;

public class Car implements Moveable {
    String type;
    Color carcolor;
    int weight;

    public Car(String type, Color carcolor, int weight) {
        this.type = type;
        this.carcolor = carcolor;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(carcolor + " " + type + " will be moved to " + destination);
    }
}
