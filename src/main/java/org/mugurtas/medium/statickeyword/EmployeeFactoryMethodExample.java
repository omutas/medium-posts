package org.mugurtas.medium.statickeyword;

public class EmployeeFactoryMethodExample {
    private String name;
    private int age;

    // Private constructor
    private EmployeeFactoryMethodExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Factory method to create instances
    public static EmployeeFactoryMethodExample createEmployee(String name, int age) {
        return new EmployeeFactoryMethodExample(name, age);
    }
}

