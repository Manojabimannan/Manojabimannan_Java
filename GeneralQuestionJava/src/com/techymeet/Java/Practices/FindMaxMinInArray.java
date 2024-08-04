package com.techymeet.Java.Practices;

public class FindMaxMinInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 5, 7, 6};

        // Call the method to find the maximum and minimum values
        int[] result = findMaxMin(numbers);

        // Print the maximum and minimum values
        System.out.println("The maximum value in the array is: " + result[0]);
        System.out.println("The minimum value in the array is: " + result[1]);
    }

    // Method to find the maximum and minimum values in an array
    public static int[] findMaxMin(int[] array) {
        // Check if the array is empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Initialize max and min with the first element of the array
        int max = array[0];
        int min = array[0];

        // Iterate through the array
        for (int i = 1; i < array.length; i++) {
            // Update max if a larger element is found
            if (array[i] > max) {
                max = array[i];
            }
            // Update min if a smaller element is found
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] ans = new int[2];
        ans[0] = max;
        ans[1] = min;

        return ans;
      // return new int[] {max,min};
    }
}

