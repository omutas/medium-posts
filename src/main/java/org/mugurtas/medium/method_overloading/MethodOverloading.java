package org.mugurtas.medium.method_overloading;

public class MethodOverloading {

        public static void main(String[] args) {
            DifferentOrder example = new DifferentOrder();
            example.display(10, 20.5);
            example.display(15.5, 5);
            // CHECK !!! this example is tricky check medium article https://medium.com/codimis/the-power-of-polymorphism-method-overloading-in-java-97084792bf32?sk=6156b6ceef94d2ec20c9074f8bed5503
            DifferentType example2 = new DifferentType();
            example2.display(10, 20.0);
            example2.display(15.5, 5);
            // CHECK !!!
            DifferentNumberOfParameter example3 = new DifferentNumberOfParameter();
            example3.display(10);
            example3.display(15, 5);
        }

}

class DifferentOrder {
    public void display(int x, double y) {
        System.out.println("Method 1");
    }

    public void display(double x, int y) {
        System.out.println("Method 2");
    }
}

class DifferentType {
    public void display(int x, int y) {
        System.out.println("Method 3");
    }

    public void display(double x, double y) {
        System.out.println("Method 4");
    }
}

class DifferentNumberOfParameter {
    public void display(int x) {
        System.out.println("Method 5");
    }

    public void display(int x, int y) {
        System.out.println("Method 6");
    }
}