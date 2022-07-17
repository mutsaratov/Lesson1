package org.example;

public class GiftCalculator {
    public static void calc(int maxGiftWeight, int orangeWeight, int appleWeight, int pearWeight) {

        int a =0;
        for (int pearCount = maxGiftWeight/pearWeight; pearCount >= 0; pearCount--) {
            for (int appleCount = 0; appleCount <= maxGiftWeight/appleWeight; appleCount++) {
                for (int orangeCount = 0; orangeCount <= maxGiftWeight/orangeWeight; orangeCount++) {
                    if (((maxGiftWeight - pearWeight*pearCount - appleWeight*appleCount - orangeWeight*orangeCount) == 0)) {
                        a+=1;
                        System.out.println("Variant number " + a + ": count of pears = " + pearCount + ", count of apples = " + appleCount + ", count of oranges = " + orangeCount );
                }
                }
            }
        }
    }
}
