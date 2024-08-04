package com.techymeet.Java.Practices;

public class MissingNumber2 {

    public static void main(String[] args) {
        int[] arr = {15, 9, 24, 18, 21};
        
        // Find the minimum and maximum values in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int actualSum = 0;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            actualSum += num;
        }

        // Calculate the expected sum of the range from min to max
        int expectedSum = 0;
        for (int i = min; i <= max; i++) {
            expectedSum += i;
        }

        // The missing number is the difference between the expected sum and the actual sum
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}

