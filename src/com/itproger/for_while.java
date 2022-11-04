package com.itproger;

public class for_while {
    public static void main(String[] args) {
        // циклы
        for (float i = 5; i < 25; i += 2) {
            if (i % 3 == 0)  // пропустится 9 и 15
                continue;
            if (i > 17)
                break;
            System.out.println(i);
        }


//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i*=100;
//        }while (i < 10);
    }
}
