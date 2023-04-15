package org.mugurtas.medium.enum_comparison;

public class Performance {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        long startTime, endTime;
        Color c1 = Color.RED;
        Color c2 = Color.RED;

        // Single comparing enums using ==
        startTime = System.nanoTime();
        if (c1 == c2) {
            // do something
        }
        endTime = System.nanoTime();
        System.out.println("Single comparing enums using == took " + (endTime - startTime) + " ns");

        // Single comparing enums using equals
        startTime = System.nanoTime();
        if (c1.equals(c2)) {
            // do something
        }
        endTime = System.nanoTime();
        System.out.println("Single comparing enums using equals took " + (endTime - startTime) + " ns");

        // Comparing enums using ==
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            if (c1 == c2) {
                // do something
            }
        }
        endTime = System.nanoTime();
        System.out.println("Multiple comparing enums using == took " + (endTime - startTime) + " ns");

        // Comparing enums using equals
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            if (c1.equals(c2)) {
                // do something
            }
        }
        endTime = System.nanoTime();
        System.out.println("Multiple comparing enums using equals took " + (endTime - startTime) + " ns");

    }

}
