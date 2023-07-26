package org.mugurtas.medium.generic_best;
import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {

    public static void main(String[] args) {
        // Creating a raw type (avoid this)
        List rawList = new ArrayList();
        rawList.add("Hello");    // String element
        rawList.add(42);         // Integer element

        // Getting elements from the raw list without type safety
        String strElement = (String) rawList.get(0);
        Integer intElement = (Integer) rawList.get(1);

        System.out.println("String Element: " + strElement);
        System.out.println("Integer Element: " + intElement);

        // This line of code will cause a RunTimeException
        Integer intError = (Integer) rawList.get(0);
    }
}
