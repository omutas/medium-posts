package org.mugurtas.medium.enum_comparison;

public class CompileTimeSafety {
    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        BlueObject objectToCheck = new BlueObject();
        Color c1 = Color.BLUE;

        System.out.println(c1.equals(objectToCheck.getColor()));  // This will print "false"
        //System.out.println(c1 == objectToCheck.getColor());  // This will not compile
    }
}
