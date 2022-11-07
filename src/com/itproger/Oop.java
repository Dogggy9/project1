package com.itproger;

public class Oop {
    public static void main(String[] args) {
        // ООП: классы и объекты
        Car bmw = new Car(250.5f, 2500, "Black", new byte[]{0, 0, 0});
        bmw.engine.setValues(true, 10000);
        bmw.engine.info();

        Truck truck = new Truck(5600, new byte[]{100, 0, 100});
        truck.engine.setValues(false, 1000000);
        truck.engine.info();
//        truck.setValues(250.5f, 2500, "Black", new byte[]{0, 0, 0}, true);
//        System.out.println(truck.getValues());

//        truck.setLoaded(true);
//        truck.getLoaded();
    }
}
