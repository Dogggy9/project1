package com.itproger;

public class Car extends Transport{
    public  Car(float speed, int weight, String color, byte[] coordinate){
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект движется со скоростью: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return false;
    }
}