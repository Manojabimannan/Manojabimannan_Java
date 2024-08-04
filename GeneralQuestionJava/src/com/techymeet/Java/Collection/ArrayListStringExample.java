package com.techymeet.Java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStringExample {

    public static void main(String[] args) {

        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.add("Mohan_Babu");
        arrayString.add("Ravi_Kumar");
        arrayString.add("John_Doe");
        arrayString.set(1, "Ravi_Verma"); // Update String Value

        for (int i = 1; i <= 5; i++) {
            arrayString.add("User_" + i);
        }

        System.out.println(arrayString.get(1)); // Ravi_Verma
        System.out.println(arrayString.contains("Mohan_Babu")); // Boolean Return (T or F)
        System.out.println(arrayString.remove(3)); // Remove String from ArrayList
        System.out.println(arrayString); // Simple ArrayList Object Passed to the Statement

        for (String str : arrayString) {
            System.out.println(str);
        }

        System.out.println("Using Iterator");
        Iterator<String> iterator = arrayString.iterator();

        System.out.println("Using While Loop with Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

