package org.example;

import java.util.Scanner;

public class LuckyCheck {
    public static void check(int number) {

        String num = Integer.toString(number);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(num.substring(i,i+1));
        }
        if (arr[0]+arr[1]+arr[2] == arr[3]+arr[4]+arr[5]) {
            System.out.println("Yeah. Lucky");
        } else {
            System.out.println(":( Not lucky");
        }
       // String firstHalf = number.substring(0,3);
       // String secondHalf = number.substring(3,6);
       // System.out.println(firstHalf + secondHalf);

    }
}
