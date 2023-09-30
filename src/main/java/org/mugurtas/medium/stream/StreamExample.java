package org.mugurtas.medium.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<String> list = null;

        Stream<String> stream = nullableCollectionToStream(list);

        filterNullExample();

    }

    public static void filterNullExample() {
        List<String> list = Arrays.asList("String", null, "Example");

        list.stream().filter(Objects::nonNull).forEach(item -> System.out.println(item.length()));
    }

    public static void allMatchesExample() {
        Set<String> test = new HashSet<>();

        boolean testOut = test.stream().allMatch(String::isEmpty);

        System.out.println(testOut);
    }

    static <T> Stream<T> nullableCollectionToStream(Collection<T> coll) {
        return coll == null ? Stream.empty() : coll.stream();
    }
}
