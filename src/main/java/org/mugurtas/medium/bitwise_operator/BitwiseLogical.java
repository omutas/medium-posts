package org.mugurtas.medium.bitwise_operator;

public class BitwiseLogical {

    public static void main(String... args) {

        // Bitwise AND (&) operator will execute both of the expressions
        if (isEven(1) & isEven(3)) {
            // This code will not execute
        }

        // Logical AND (&&) operator does lazy evaluation
        // So only the first statement will be executed
        if (isEven(5) && isEven(7)) {
            // This code will not execute
        }

        // Bitwise OR (|) operator will execute both of the expressions
        if (isEven(2) | isEven(4)) {
            // This code will not execute
        }

        // Logical OR (||) operator does lazy evaluation
        // So only the first statement will be executed
        if (isEven(6) || isEven(8)) {
            // This code will not execute
        }

        String text = null;

        // Throws NPE because both of the expressions are executed.
        if (text != null & text.length() > 1) {

        }

    }

    public static boolean isEven(int number) {
        System.out.println("Number to check " + number);
        return number % 2 == 0;
    }
}
