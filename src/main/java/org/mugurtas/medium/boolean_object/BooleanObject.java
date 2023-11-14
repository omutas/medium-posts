package org.mugurtas.medium.boolean_object;

public class BooleanObject {
    Boolean trueObj = Boolean.TRUE;
    Boolean falseObj = Boolean.FALSE;
    Boolean nullObj;
    boolean defaultPrimitive;
    public static void main(String[] args) {

        BooleanObject booleanObject = new BooleanObject();


        Boolean objBoolean = new Boolean(true);
        Boolean objBoolean2 = new Boolean(true);

        if(objBoolean == objBoolean2) {
            System.out.println("object boolean comparison ==");
        }

        if (booleanObject.defaultPrimitive) {
            System.out.println("primitive true");
        } else {
            System.out.println("primitive false");
        }


        if (booleanObject.trueObj) {
            System.out.println("true");
        }
        if (!booleanObject.falseObj) {
            System.out.println("false");
        }

        try {
            // this if block throws NPE
            if (booleanObject.nullObj) {
                System.out.println("null");
            }
        } catch (NullPointerException exp) {
            System.out.println("Object boolean is null and if block throw NPE because of it");
        }
    }
}
