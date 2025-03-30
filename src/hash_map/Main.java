package hash_map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //add key values (country, city)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        //print the whole map
        System.out.println("Initial map: " + capitalCities);

        //get value by key
        System.out.println("Capital of Germany is: " + capitalCities.get("Germany") + ".");

        //print keys
        for (String i : capitalCities.keySet()) { //use the keySet() method if you only want the keys
            System.out.println(i);
        }

        //print values
        for (String i : capitalCities.values()) { //use the values() method if you only want the keys
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + "; value: " + capitalCities.get(i));
        }

        //remove a key value pair
        capitalCities.remove("Norway");
        System.out.println("Map after removing Norway: " + capitalCities);

        //size - check how many entries are in the map
        System.out.println("Number of elements in map: " + capitalCities.size());

        //clear - remove all entries from the map
        capitalCities.clear();
        System.out.println(capitalCities);

    }
}
