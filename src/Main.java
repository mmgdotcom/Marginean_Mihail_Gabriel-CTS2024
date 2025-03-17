public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome.");
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        //This is a comment.
        String name = "John";
        System.out.println(name);
        //int myNum = 15; //Integer (whole number)
        //System.out.println(myNum);
        final int myNum = 15; //this change the variable to a constant (unchangeable and read-only)
        //myNum = 20; //myNum is now 20
        System.out.println(myNum);
        float myFloatNum = 5.99f; //Floating point number
        char myLetter = 'D'; //Character
        boolean myBool = true; //boolean
        String myText = "Hello"; //String
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println("Hello " + name);
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + ' ' + lastName;
        System.out.println(fullName);
        int x = 5;
        int y = 6;
        System.out.println(x + y);
        int x1 = 5;
        int y1 = 6;
        int z = 50;
        System.out.println(x1 + y1 + z);
        int x2 = 6, y2 = 7, z1 = 51;
        System.out.println(x2 + y2 + z1);
        int x3, y3, z2;
        x3 = y3 = z2 = 50;
        System.out.println(x3 + y3 + z2);
        int minutesPerHour = 60; //Good
        int m = 60; //OK, but not so easy to understand what m actually is
        //Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        //print variables
        System.out.println("Student variables:");
        System.out.println("studentName: " + studentName);
        System.out.println("studentID: " + studentID);
        System.out.println("studentAge: " + studentAge);
        System.out.println("studentFee: " + studentFee);
        System.out.println("studentGrade: " + studentGrade);

        int length = 4;
        int width = 6;
        int area;

        //calculate the area of a rectangle
        area = length * width;

        //print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

        //Primitive data types - includes: byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes

        //A primitive data type specifies the type of variable and the kind of values it can hold
        //byte - stores whole numbers from -128 to 127
        //short - Stores whole numbers from -32,768 to 32,767
        //int - stores whole number from -2,147,483,648 to 2,147,483,647
        //long - store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
        //float	- stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        //double - stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        //boolean - stores true or false values
        //char - stores a single character/letter or ASCII values

        long myLongNum = 15000000000L;
        System.out.println(myLongNum);

        float mySecondFloatNum = 5.75f;
        System.out.println(mySecondFloatNum);

        double myDoubleNum = 19.99d;
        System.out.println(myDoubleNum);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        //char variables can store ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println("65 ASCII code: " + myVar1);
        System.out.println("66 ASCII code: " + myVar2);
        System.out.println("67 ASCII code: " + myVar3);

        //Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items + costPerItem;
        char currency = '$';

        //Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem);
        System.out.println("Total cost: " + totalCost + currency);

        /*
        Non-Primitive Data Types
        Non-primitive data types are called reference types because they refer to objects.

        The main differences between primitive and non-primitive data types are:

        Primitive types in Java are predefined and built into the language, while non-primitive
        types are created by the programmer (except for String).

        Non-primitive types can be used to call methods to perform certain operations, whereas
        primitive types cannot.

        Primitive types start with a lowercase letter (like int), while non-primitive types
        typically starts with an uppercase letter (like String).

        ! ! ! Primitive types always hold a value, whereas non-primitive types can be null.

        Examples of non-primitive types are Strings, Arrays, Classes etc.
        */

        //int checkNull = null; => it can't be null

    }
}
