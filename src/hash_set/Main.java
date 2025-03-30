package hash_set;

import java.util.HashSet;

public class Main {
    //a HashSet is a collection of items where every item is unique, and it is found in the java.util package
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        if (cars.contains("BMW")) {
            System.out.println("Inregistrarea exista!");
        } else {
            System.out.println("Inregistrarea NU exista!");
        }

        cars.remove("BMW");

        if (cars.contains("BMW")) {
            System.out.println("Inregistrarea exista!");
        } else {
            System.out.println("Inregistrarea NU exista!");
        }

        for (String i : cars) {
            System.out.println(i);
        }


    }
}
