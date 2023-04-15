package org.mugurtas.medium.enum_comparison;

public class NullSafety {
    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        CompileTimeSafety.Color c1 = null;
        CompileTimeSafety.Color c2 = CompileTimeSafety.Color.GREEN;

        System.out.println(c1 == c2);  // This will print "false"
        System.out.println(c1.equals(c2));  // This will throw exception
    }
}
