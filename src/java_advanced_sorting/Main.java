package java_advanced_sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        //use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        //display the cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}