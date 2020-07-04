package com.wripo.day10;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(mostFrequentDigit(669260267));   // 6
        System.out.println(mostFrequentDigit(57135203));    // 3
        System.out.println(mostFrequentDigit(888444777));   // 4
        System.out.println(mostFrequentDigit(42));          // 2
        System.out.println(mostFrequentDigit(54321));       // 1
    }
    
    // Returns the digit value that occurs most frequently in n.
    // Breaks ties by choosing the smaller value.
    public static int mostFrequentDigit(int n) {
        int[] counts = new int[10];
        while (n > 0) {
            int digit = n % 10;  // pluck off a digit and tally it
            counts[digit]++;
            n = n / 10;
        }
        
        // find the most frequently occurring digit
        int bestIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[bestIndex]) {
                bestIndex = i;
            }
        }
        
        return bestIndex;
    }
}
