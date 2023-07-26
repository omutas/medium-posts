package org.mugurtas.medium.generic_best;

public class MathOperation<T extends Number> {
    private T operand1;
    private T operand2;

    public MathOperation(T operand1, T operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1.doubleValue() + operand2.doubleValue();
    }

    public double multiply() {
        return operand1.doubleValue() * operand2.doubleValue();
    }
}

