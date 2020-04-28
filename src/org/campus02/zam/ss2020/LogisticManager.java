package org.campus02.zam.ss2020;

import java.util.ArrayList;

public class LogisticManager {
    ArrayList<Moveable> moveableobject = new ArrayList<>();
    public void addMoveableObject(Shirt s){
        moveableobject.add(s);
    }
    public void addMoveableObject(Car c){
        moveableobject.add(c);
    }
    public void moveAll(String destination){
        for(Moveable m : moveableobject){
            m.move(destination);
        }
    }
}
