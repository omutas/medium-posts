package org.mugurtas.medium.enum_comparison;

public class Readability {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Comparing enums using ==
        if (today == Day.MONDAY) {
            System.out.println("Today is Monday");
        }

        // Comparing enums using equals
        if (today.equals(Day.MONDAY)) {
            System.out.println("Today is Monday");
        }
    }

}
