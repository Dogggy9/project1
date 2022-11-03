package com.itproger;

import java.util.Scanner;

public class Ariphmetic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите 2 число: ");
        int num2 = scan.nextInt();
        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        float res4 = (float) num1 / num2;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);


    }
}
