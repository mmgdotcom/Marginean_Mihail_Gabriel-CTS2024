package java_wrapper_classes;

//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//Sometimes you must use wrapper classes, for example when working with Collection objects,
//such as ArrayList, where primitive types cannot be used (the list can only store objects):
//ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
//ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

public class Main {
    public static void main(String[] args) {
        Integer myInt = 5000;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
