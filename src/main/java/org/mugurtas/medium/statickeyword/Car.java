package org.mugurtas.medium.statickeyword;

public class Car {
    static int numCars = 0;

    Car() {
        numCars++;
    }

    public static int getCount() {
        return numCars;
    }
}

