package org.mugurtas.medium.clones;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Person implements Cloneable, Serializable {
    private String name;
    private List<String> phoneNumbers;

    public Person(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public Person(Person that) {
        this(that.getName(), new ArrayList<>(that.getPhoneNumbers()));
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> originalPhoneNumbers = new ArrayList<>();
        originalPhoneNumbers.add("123-456-7890");

        Person originalPerson = new Person("John", originalPhoneNumbers);

        // Shallow clone
        Person shallowClone = (Person) originalPerson.clone();

        // Deep clone using custom method (explained below)
        Person deepClone = deepClone(originalPerson);

        Person deepCopy = new Person(originalPerson);

        Person deepCopySerialization = cloneUsingSerialization(originalPerson);

        // Modify the shallow clone
        shallowClone.getPhoneNumbers().add("987-654-3210");

        // Modify the deep clone
        deepClone.getPhoneNumbers().add("555-555-5555");

        deepCopy.getPhoneNumbers().add("666-66-6666");
        deepCopySerialization.getPhoneNumbers().add("777-777-7777");

        System.out.println("Original Person: " + originalPerson.getPhoneNumbers());
        System.out.println("Shallow Clone: " + shallowClone.getPhoneNumbers());
        System.out.println("Deep Clone method: " + deepClone.getPhoneNumbers());
        System.out.println("Deep Clone constructor: " + deepCopy.getPhoneNumbers());
        System.out.println("Deep Clone serialization: " + deepCopySerialization.getPhoneNumbers());
    }

    public static Person deepClone(Person original) {
        List<String> phoneNumbersCopy = new ArrayList<>(original.getPhoneNumbers());
        return new Person(original.getName(), phoneNumbersCopy);
    }

    public static <T> T cloneUsingSerialization(T original) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(original);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (T) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}