package com.itproger;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // Массивы данных многомерные
        char[][] syms = new char[2][3];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {5, 7},
                {7, 3},
                {2, 0}
        };
        nums[1][1] = 67;
        System.out.println(nums[1][1]);

        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<2; j++){
                System.out.println(nums[i][j]);
            }
        }
    }
}
