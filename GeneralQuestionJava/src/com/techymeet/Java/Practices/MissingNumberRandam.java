package com.techymeet.Java.Practices;

import java.util.Arrays;

public class MissingNumberRandam {
    public static void findMissingNumbers(int[] arr, int rangeStart, int rangeEnd) {
        Arrays.sort(arr);
        int arrIndex = 0;

        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (arrIndex < arr.length && arr[arrIndex] == i) {
                arrIndex++;
            } else {
                System.out.println("Missing number: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9};
        int rangeStart = 1;
        int rangeEnd = 9;
        findMissingNumbers(arr, rangeStart, rangeEnd);
    }
}

