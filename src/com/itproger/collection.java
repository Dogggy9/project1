package com.itproger;

import java.util.ArrayList;

//import java.util.LinkedList;

public class collection {
    public static void main(String[] args){
        // Коллекции в Java
        ArrayList<Integer> nums = new ArrayList<>();  // указать размер или добавлять динамически
        nums.add(5);
        nums.add(50);
        nums.add(1, 30); // добавляет в определенное место

//        System.out.println(nums.size());  // выводит длину списка
        System.out.println(nums.get(1)); // выводит по индексу

        nums.remove(1);  // стирает в определенном месте
//        nums.clear();  // полностью очистить список

        for (Integer el: nums){
            System.out.println(el);
        }
//        LinkedList<Float> numbers = new LinkedList<>();
//        numbers.add(5.6f);
//        numbers.add(15.26f);
//        numbers.add(5.6432f);
//
//        for (Float el: numbers){
//            System.out.println(el);
//        }
    }
}
