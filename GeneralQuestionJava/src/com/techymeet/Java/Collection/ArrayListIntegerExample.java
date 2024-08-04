package com.techymeet.Java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntegerExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayNumber = new ArrayList<>();
        arrayNumber.add(100);
        arrayNumber.add(250);
        arrayNumber.set(1, 200); // Update Integer Value

        for (int i = 0; i <= 10; i++) {
            arrayNumber.add(i);
        }

        System.out.println(arrayNumber.get(1)); // 200
        System.out.println(arrayNumber.contains(100)); // Boolean Return (T or F)
        System.out.println(arrayNumber.remove(5)); // Remove Integer from ArrayList
        System.out.println(arrayNumber); // Simple ArrayList Object Passed to the Statement

        for (int num : arrayNumber) {
            System.out.println(num);
        }

        System.out.println("Using Iterator");
        Iterator<Integer> iterator = arrayNumber.iterator();
        System.out.println(iterator.next());

        System.out.println("Using While Loop with Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
