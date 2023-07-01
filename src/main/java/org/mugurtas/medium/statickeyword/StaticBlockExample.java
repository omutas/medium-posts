package org.mugurtas.medium.statickeyword;

public class StaticBlockExample {
    private static int number;

    // Static block
    static {
        System.out.println("Inside the static block.");
        // Perform some initialization or setup
        number = 10;
    }

    public static void main(String[] args) {
        System.out.println("Number: " + number);
    }
}

