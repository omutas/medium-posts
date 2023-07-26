package org.mugurtas.medium.generic_best;

// Generic interface to represent a shape
interface Shape<T> {
    double calculateArea();
    double calculatePerimeter();
    T getShapeInfo();
}

// class to implement the Shape interface for rectangles
class Rectangle<T extends Number> implements Shape<T> {
    private T length;
    private T width;

    public Rectangle(T length, T width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length.doubleValue() * width.doubleValue();
    }

    public double calculatePerimeter() {
        return 2 * (length.doubleValue() + width.doubleValue());
    }

    public T getShapeInfo() {
        return length;
    }
}

// class to implement the Shape interface for circles
class Circle<T extends Number> implements Shape<T> {
    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius.doubleValue();
    }

    public T getShapeInfo() {
        return radius;
    }
}

public class GenericShapesExample {
    public static void main(String[] args) {
        // Creating a rectangle and a circle
        Shape<Integer> rectangle = new Rectangle<>(5, 3);
        Shape<Double> circle = new Circle<>(2.5);

        // Calculating and displaying their areas and perimeters
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 15.0
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); // Output: Rectangle Perimeter: 16.0
        System.out.println("Circle Area: " + circle.calculateArea()); // Output: Circle Area: 19.634954084936208
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); // Output: Circle Perimeter: 15.707963267948966
    }
}

