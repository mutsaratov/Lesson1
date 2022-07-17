package org.example;

public class GiftCalculator2 {
    public static void calc(int maxGiftWeight, int orangeWeight, int appleWeight, int pearWeight) {

        int a = 0;
        for (int appleCount = 0; appleCount <= maxGiftWeight / appleWeight; appleCount++) {
            for (int orangeCount = 0; orangeCount <= maxGiftWeight / orangeWeight; orangeCount++) {
                int ostatok = maxGiftWeight - appleWeight * appleCount - orangeWeight * orangeCount;
                if ((ostatok % pearWeight == 0)) {
                    if (ostatok >= 0) {
                        a += 1;
                        int pearCount = ostatok / pearWeight;
                        System.out.println("Variant number " + a + ": count of pears = " + pearCount + ", count of apples = " + appleCount + ", count of oranges = " + orangeCount);
                    }
                }
            }
        }
    }
}
