package org.mugurtas.medium.functional_interface;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 3));
    }
}
