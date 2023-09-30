package org.mugurtas.medium.optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String blogName2 = Optional.of("Codimis").orElseGet(() -> getName());
        System.out.println(blogName2);
        String blogName1 = Optional.of("Example").orElse(getName());
        System.out.println(blogName1);
        flatMapExample();
        streamApisExample();
        filterExample();
        streamExample();
    }
    public static String getName() {
        System.out.println("getName called");
        return "default";
    }

    public static void flatMapExample() {
        Optional<String> optional = Optional.of("Hello, World!");
        Optional<Integer> flatMapped = optional.flatMap(val -> Optional.of(val.length()));
        Optional<Optional<Integer>> mapped = optional.map(val -> Optional.of(val.length()));
        flatMapped.ifPresent(System.out::println);
        mapped.ifPresent(map -> map.ifPresent(System.out::println));
    }

    public static void filterExample() {
        Optional<String> optional = Optional.of("Hello, World!");
        Optional<String> filtered = optional.filter(val -> val.contains("Hell,"));
        Optional<String> filtered2 = optional.filter(val -> val.contains("Hello,"));
        System.out.println(optional);
        System.out.println(filtered);
        System.out.println(filtered2);
    }

    public static void streamApisExample() {
        Order orderWithoutValue = Order.order();
        Order orderWithValue = new Order(new User(18));

        Optional.of(orderWithoutValue)
            .filter(o -> o.user != null)
            .map(Order::getUser)
            .map(User::getAge)
            .ifPresentOrElse(System.out::println, OptionalExample::missingUserNotif);
        Optional.of(orderWithValue)
            .filter(o -> o.user != null)
            .map(Order::getUser)
            .map(User::getAge)
            .ifPresentOrElse(System.out::println, OptionalExample::missingUserNotif);

    }

    public static void streamExample() {
        List<Optional<BigDecimal>> amounts = new ArrayList<>();
        amounts.add(Optional.of(BigDecimal.TEN));
        amounts.add(Optional.empty());
        amounts.add(Optional.of(BigDecimal.ONE));

        BigDecimal totalAmount = amounts.stream()
            .flatMap(Optional::stream)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total Amount: " + totalAmount);

    }


    public static void missingUserNotif() {
        System.out.println("User is missing");
    }

}

class Order {
    User user;

    public Order(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public static Order order() {
        return new Order(null);
    }
}

class User {
    int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
