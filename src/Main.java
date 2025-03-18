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

        //Type casting is when you assign a value of one primitive data type to another type.
        //In Java, there are two types of casting:
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        int myNewInt = 9;
        double myNewDouble = myNewInt; //Automatic casting: into to double
        System.out.println(myNewInt); //Outputs 9
        System.out.println(myNewDouble); //Outputs 9.0

        //Narrowing casting must be done manually by placing the type in
        //parentheses () in front of the value:
        double myManuallyDouble = 9.78d;
        int myManuallyInt = (int) myManuallyDouble; //Manual casting: double to int
        System.out.println(myManuallyDouble); //Outputs 9.78
        System.out.println(myManuallyInt); //Outputs 9

        //real life example
        //set the maximum possible score in the game to 500
        int maxScore = 500;

        //the actual score of the user
        int userScore = 423;

        //Calculate the percentage of the user's score in relation to the maximum
        //available score.
        //Convert userScore to float to make sure that the division is accurate.
        float percentage = (float) userScore/maxScore * 100.0f;

        System.out.println("User's percentage is: " + percentage);

        //Java divides the operators into the following groups:
        //Arithmetic operators
        //Assignment operators
        //Comparison operators
        //Logical operators
        //Bitwise operators

        int q = 5;
        q += 10;
        System.out.println("q = " + q);

        int ab = 1, bc = 2;
        System.out.println(ab < bc);

        String txt = "ABCDEFGHIJKLMNOPQRS";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

        String abc = "10";
        int cba = 20;
        String bac = abc + cba;
        System.out.println("abc + cba = " + bac);

        String escape = "These are \"quotes\".";
        System.out.println(escape);

        System.out.println("Maxim between " + ab + " and " + bc + " is " + Math.max(ab, bc) + ".");

        float randomNum = (float)(Math.random() * 101f); //0 to 100 if I use int
        System.out.println(randomNum);

        System.out.println(cba == 20);

        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote!");
        }

        //There is also a shorthand if else, which is known as the ternary operator
        //because it consists of three operands.
        //It can be used to replace multiple lines of code with a single line, and
        //is most often used to replace simple if else statements:
        //Syntax
        //variable = (condition) ? expressionTrue : expressionFalse;
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //the equivalent would be:
        int time1 = 21;
        String result = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }
        //Instead of writing many if..else statements, you can use the switch statement.
        //The switch statement selects one of many code blocks to be executed:
        //Syntax
        /*
        switch(expression) {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
        }
        */

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.
        //The example below will print the numbers 0 to 4:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //Statement 1 sets a variable before the loop starts (int i = 0).
        //Statement 2 defines the condition for the loop to run (i must be less than 5).
        //If the condition is true, the loop will start over again, if it is false, the loop will end.
        //Statement 3 increases a value (i++) each time the code block in the loop has been executed.

        //nested loops
        //outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); //executes 2 times

            //inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); //executes 6 times (2 * 3)
            }
        }

        //for-each loop
        /*
        for (type variableName : arrayName) {
            //code block to be executed
        }
        */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //program that counts to 100 by tens
        for (int i = 0; i <= 100; i += 10){
            System.out.println(i);
        }

        //print the multiplication table for a specified number
        int number = 2;
         for (int i = 1; i <= 10; i++) {
             System.out.println(number + " x " + i + " = " + (number * i));
         }

         //example to stop the loop when i is equal to 4
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        //To declare an array, define the variable type with square brackets:
        //String[] cars;
        String[] cars1 = {"Volvo", "BMW", "Ford"};
        //int[] myNum = {10, 20, 30};
        //You can access an array element by referring to the index number.
        System.out.println("The first car from the cars1 variable is: " + cars1[0] + ".");
        //Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        //To change the value of a specific element, refer to the index number:
        cars1[0] = "Opel";
        System.out.println("The first car from the cars1 variable is updated to: " + cars1[0] + ".");
        //To find out how many elements an array has, use the length property:
        System.out.println("The cars1 variable length is: " + cars1.length); //prints the number of elements

        for (int i = 0; i < cars1.length; i++) {
            System.out.println("The car no. " + (i + 1) + " is " + cars1[i]);
        }

        for (String i : cars1) {
            System.out.println(i);
        }
        //The example above can be read like this: for each String element (called i - as in index) in cars,
        //print out the value of i.
        //If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
        //it does not require a counter (using the length property), and it is more readable.

        //practical example of using arrays - program that calculates the average of different ages
        //an array storing different ages
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        //get the length of the array
        int lengthAges = ages.length;

        //loop through the elements of the array
        for(int age : ages) {
            sum += age; //For each age in ages, add age to sum.
        }

        //calculate the average by dividing the sum by the length
        avg = sum / lengthAges;

        //print the average
        System.out.println("The average age is: " + avg + ".");

        //program that finds the lowest age among different ages
        //nn array storing different ages
        int ages1[] = {20, 22, 18, 35, 48, 26, 87, 70};

        //get the length of the array
        int length1 = ages.length;

        //create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = ages[0];

        //loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            //check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
                //if the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

        //output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);

        //Multidimensional Arrays
        //A multidimensional array is an array of arrays.
        //Multidimensional arrays are useful when you want to store data as a tabular form,
        //like a table with rows and columns.
        //To create a two-dimensional array, add each array within its own set of curly braces:
        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        //myNumbers is now an array with two arrays as its elements.
        //To access the elements of the myNumbers array, specify two indexes: one for the array,
        //and one for the element inside that array.
        //This example accesses the third element (2) in the second array (1) of myNumbers:
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); //outputs 7
        System.out.println(myNumbers[0][1]); //outputs 2
        //Remember that: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        //You can also change the value of an element:
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
        System.out.println("---------");

        //You can also use a for loop inside another for loop to get the elements of
        //a two-dimensional array (we still have to point to the two indexes):
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println("---------");

        //Or you could just use a for-each loop, which is considered easier to read and write:
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
