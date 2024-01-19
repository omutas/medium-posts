package org.mugurtas.medium.functional_interface;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@FunctionalInterface
interface ErrorHandler {
    void handleError();
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 3));

        ErrorHandler test1 = () -> System.out.println("test");
        ErrorHandler test2 = () -> System.out.println("test2");
        caller(test1);
        caller(test2);
    }

    public static void caller(ErrorHandler call) {
        call.handleError();
    }
}