package org.mugurtas.medium.interned_string;

public class InternedString {
    public static void main(String[] args) {
        String str1 = "Hello"; // String literal, interned
        String str2 = new String("Hello"); // String object, not interned
        String str3 = str2.intern(); // Explicitly intern str2
        String str4 = new String("Hello").intern(); // Explicitly intern new String object
        String str5 = new String("Hello"); // String object, not interned
        str5.intern(); // intern does not affect str5 as long as it is not assigned to str5 again
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false

    }
}
