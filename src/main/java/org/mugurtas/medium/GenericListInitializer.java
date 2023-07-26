package org.mugurtas.medium;

import java.util.ArrayList;
import java.util.List;

public class GenericListInitializer {
    public static void main(String[] args) {
        // Example usage
        Person person = new Person();
        initializeListField(person, Person::getAddresses, Person::setAddresses);

        System.out.println(person.getAddresses());
    }

    static <T, U extends List<?>> void initializeListField(T object, Getter<T, U> getter, Setter<T, U> setter) {
        U field = getter.get(object);
        if (field == null) {
            try {
                field = (U) new ArrayList<>();
                setter.set(object, field);
            } catch (ClassCastException e) {
                // Handle the exception if the field is not of type List
                e.printStackTrace();
            }
        }
    }

    // Functional interfaces for getting and setting field values
    @FunctionalInterface
    interface Getter<T, U> {
        U get(T obj);
    }

    @FunctionalInterface
    interface Setter<T, U> {
        void set(T obj, U value);
    }

    // Example class
    static class Person {
        private List<String> addresses;

        public List<String> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<String> addresses) {
            this.addresses = addresses;
        }
    }
}
