package org.campus02.zam.ss2020;

public class Main {

    public static void main(String[] args) {
	LogisticManager lm = new LogisticManager();
	Car c = new Car("BMV", Color.BLUE, 500);
	Shirt s = new Shirt("Luis Phillippe", Color.GREEN, 39);
	lm.addMoveableObject(c);
	lm.addMoveableObject(s);
	lm.moveAll("Graz");
    }
}
