package com.itproger;

public class function {
//    public static void main(String[] args) {
//        // Методы
////        info("Hello world");
////        String java = "java";
////        info(java);
////        info("");
//
//        int num = 7;
//        int result = summa((short) 5, num);
//        info(String.valueOf(result));
//    }
//
//    public static int summa(short a, int b) {  // возвращает число
//        int res = a + b;
//        String result = "Результат: " + res;
//        info(result);
//        return res;
//    }
//
//    public static void info(String word) {  // void - ничего не возвращает
//        System.out.print(word);
//        System.out.println("!");
//    }
    public static void main(String[] args) {
        byte[] nums1 = new byte[]{5, 6, 8};
        int summ1 = summaArray(nums1);
        System.out.println("Сумма 1: " + summ1);
    }
    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;

    }
}
