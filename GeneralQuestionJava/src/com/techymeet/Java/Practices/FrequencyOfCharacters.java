package com.techymeet.Java.Practices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String text = "hello world";
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Simple for loop to count the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Print the frequency of each character
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Character '" + (char)i + "' occurs " + frequency[i] + " times.");
            }
        }
    }
}

