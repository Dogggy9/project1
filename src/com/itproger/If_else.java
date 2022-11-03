package com.itproger;

import java.util.Scanner;

public class If_else {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите роль: ");
//        String role = scanner.nextLine();
//        System.out.print("Введите пароль: ");
//        String pass = scanner.nextLine();
//        if (role.equals("Admin") && pass.equals("12345")){
//            System.out.println("Все пользователи");
//        } else {
//            System.out.print("Привет, как вас зовут? ");
//            String name = scanner.nextLine();
//        }
//
//    }
    public static void main(String[] args){
        // Условные конструкции switch-case
        Scanner scanner = new Scanner(System.in);
        System.out.println("число");
        int num1 = scanner.nextInt();
        System.out.println("число");
        int num2 = scanner.nextInt();
        System.out.println("число");
        int num3 = scanner.nextInt();
        System.out.println(num3);
        switch (num1) {
            case 1:
                System.out.println("цифра 1");
                break;
            case 2:
                System.out.println("цифра 2");
                break;
            case 5:
                System.out.println("цифра 5");
                break;
            default:
                System.out.println("Default");
        }
    }
}
