package com.itproger;

public class Oop {
    public static void main(String[] args) {
        // ООП: классы и объекты
//        Car bmw = new Car(250.5f, 2500, "Black", new byte[]{0, 0, 0});

        Truck truck = new Truck(5600, new byte[]{100, 0, 100});
        truck.setValues(250.5f, 2500, "Black", new byte[]{0, 0, 0}, true);
        System.out.println(truck.getValues());

//        truck.setLoaded(true);
//        truck.getLoaded();
    }
}
