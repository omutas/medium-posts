package org.mugurtas.medium.generic_best;

import java.util.List;

public class GenericExample {

    // Generic method with bounded wildcard
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(3, 7, 1, 5);
        Integer maxInt = findMax(intList);
        System.out.println("Max Integer: " + maxInt); // Output: Max Integer: 7

        List<String> stringList = List.of("apple", "banana", "orange");
        String maxString = findMax(stringList);
        System.out.println("Max Integer: " + maxString); // Output: Max Integer: orange

    }
}

