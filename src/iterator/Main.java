package iterator;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {
    //an Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    //It is called an "iterator" because "iterating" is the technical term for looping.
    public static void main(String[] args) {
        //make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");

        //get the iterator
        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        //loop through a collection - use hasNext() and next() methods of Iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
