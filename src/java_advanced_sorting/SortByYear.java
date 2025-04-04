package java_advanced_sorting;

import java.util.Comparator;

//sort Car objects by year
class SortByYear implements Comparator {
    public int  compare(Object obj1, Object obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        //compare the objects
        if (a.year < b.year) return -1; //the first car has a smaller year
        if (a.year > b.year) return 1; //the first car has a larger year
        return 0; //both cars have the same year
    }
}

