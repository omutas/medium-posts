package org.mugurtas.medium.generic_best;

import java.util.Arrays;

public class MathOperationExample {

    // Generic method with bounded wildcard
    public static <T extends Number> double sumAsDouble(T... args) {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("Args is empty or null");
        }

        return Arrays.stream(args).mapToDouble(Number::doubleValue).sum();
    }

    public static void main(String[] args) {

        // Usage of the generic class with bounded type parameter
        MathOperation<Integer> intMath = new MathOperation<>(5, 10);
        System.out.println("Addition: " + intMath.add()); // Output: Addition: 15.0
        System.out.println("Multiplication: " + intMath.multiply()); // Output: Multiplication: 50.0

        // Below comment outed code will cause a compilation error because String doesn't extend Number
        // MathOperation<String> stringMath = new MathOperation<>("Hello", "World");

        double sum = sumAsDouble(Integer.valueOf(5), Double.valueOf(6.3));
        System.out.println("Sum of 5 and 6.3 : " + sum ); // Output: Sum of 5 and 6.3 : 11.3
        // Below comment outed code will cause a compilation error because String doesn't extend Number
        //double sumError = sumAsDouble(Integer.valueOf(5), Double.valueOf(6.3), String.valueOf(1));
    }
}
