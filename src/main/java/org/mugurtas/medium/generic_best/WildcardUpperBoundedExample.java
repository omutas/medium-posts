package org.mugurtas.medium.generic_best;

import java.util.List;

public class WildcardUpperBoundedExample {

    // Method that calculates the sum of numbers in a list (upper-bounded wildcard)
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        double intSum = sumOfList(intList);
        System.out.println("Sum of Integers: " + intSum); // Output: Sum of Integers: 6.0

        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        double doubleSum = sumOfList(doubleList);
        System.out.println("Sum of Doubles: " + doubleSum); // Output: Sum of Doubles: 7.5

        // This will cause a compilation error since String is not a subclass of Number
        // List<String> stringList = List.of("one", "two", "three");
        // double stringSum = sumOfList(stringList);
    }
}
