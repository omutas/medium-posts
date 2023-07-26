package org.mugurtas.medium.generic_best;

import java.util.ArrayList;
import java.util.List;

public class WildcardLowerBoundedExample {

    // Method that adds elements to a list (lower-bounded wildcard)
    public static void addElements(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addElements(numberList);
        System.out.println("Number List: " + numberList); // Output: Number List: [1, 2, 3]

        List<Object> objectList = new ArrayList<>();
        addElements(objectList);
        System.out.println("Object List: " + objectList); // Output: Object List: [1, 2, 3]

        // This will cause a compilation error since String is not a superclass of Integer
        // List<String> stringList = new ArrayList<>();
        // addElements(stringList);
    }
}
