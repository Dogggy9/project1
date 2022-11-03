package com.itproger;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        float res;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введи второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введи действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                    break;
                }
        }

    }
}
