package com.techymeet.Java.Practices;

public class FrequencyOfIntegers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 2, 5, 2, 6};
        int[] frequency = new int[10]; // Assuming elements are between 0 and 9

        // Simple for loop to count the frequency of integers
        for (int number : numbers) {
            frequency[number]++;
        }

        // Print the frequency of each element
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Element " + i + " occurs " + frequency[i] + " times.");
            }
        }
    }
}
