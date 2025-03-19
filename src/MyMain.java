/*
public class MyMain {
    static void myMethod(){
        System.out.println("I just created my first method!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}

public class MyMain {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
    //When a parameter is passed to the method, it is called an argument. So, from the example above:
    //fname is a parameter, while Liam, Jenny and Anja are arguments.
    //Note that when you are working with multiple parameters, the method call must have the same
    //number of arguments as there are parameters, and the arguments must be passed in the same order.

}

public class MyMain {
    //create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}

//If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
//instead of void, and use the return keyword inside the method:

public class MyMain {
    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}

//Method Overloading - With method overloading, multiple methods can have the same name with different parameters:
//int myMethod(int x)
//float myMethod(float x)
//double myMethod(double x, double y)

public class MyMain {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double " + myNum2);
    }
}

//Instead of defining two methods that should do the same thing, it is better to overload one.
//In the example below, we overload the plusMethod method to work for both int and double:

public class MyMain {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(3, 5);
        double myNum2 = plusMethod(6.3, 8.4);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
//Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

//A block of code may exist on its own or it can belong to an if, while or for statement.
//In the case of for statements, variables declared in the statement itself are also
//available inside the block's scope.

//Java Recursion
//Recursion is the technique of making a function call itself.
//This technique provides a way to break complicated problems down into simple problems which are easier to solve.

public class MyMain {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
Example Explained
When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k
and returns the result. When k becomes 0, the function just returns 0. When running, the program
follows these steps:
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
Since the function does not call itself when k is 0, the program stops there and returns the result.

Halting Condition
Just as loops can run into the problem of infinite looping, recursive functions can run into the
problem of infinite recursion. Infinite recursion is when the function never stops calling itself.
Every recursive function should have a halting condition, which is the condition where the function
stops calling itself.

In the previous example, the halting condition is when the parameter k becomes 0.
It is helpful to see a variety of different examples to better understand the concept.
In this example, the function adds a range of numbers between a start and an end. The halting condition
for this recursive function is when end is not greater than start:

Use recursion to add all of the numbers between 5 to 10.

public class MyMain {
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        int result = sum (5, 10);
        System.out.println(result);
    }
}

//The developer should be very careful with recursion as it can be quite easy to slip into writing a
//function which never terminates, or one that uses excess amounts of memory or processor power.
//However, when written correctly recursion can be a very efficient and mathematically-elegant
//approach to programming.

//Java Classes/Objects
//Java is an object-oriented programming language.
//Everything in Java is associated with classes and objects, along with its attributes and methods.
//For example: in real life, a car is an object. The car has attributes, such as weight and color,
//and methods, such as drive and brake.
//A Class is like an object constructor, or a "blueprint" for creating objects.
*/

public class MyMain {
    int x = 5;

    //public static void main(String[] args) {
    //    MyMain myObj1 = new MyMain();
    //    MyMain myObj2 = new MyMain();
    //    System.out.println(myObj1.x);
    //    System.out.println(myObj2.x);
    //}
}

