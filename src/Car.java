/*
public class Car {

    //create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    //create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    //inside main, call the methods on myCar object
    public static void main(String[] args) {
        Car myCar = new Car(); //create a myCar object
        myCar.fullThrottle(); //call the fullthrottle() method
        myCar.speed(250); //call the speed() method
    }
}
*/
//Example explained
//1) We created a custom Car class with the class keyword.
//2) We created the fullThrottle() and speed() methods in the Car class.
//3) The fullThrottle() method and the speed() method will print out some text, when they are called.
//4) The speed() method accepts an int parameter called maxSpeed - we will use this in 8).
//5) In order to use the Car class and its methods, we need to create an object of the Car Class.
//6) Then, go to the main() method, which you know by now is a built-in Java method that runs your program
//(any code inside main is executed).
//7) By using the new keyword we created an object with the name myCar.
//8) Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using
// the name of the object (myCar), followed by a dot (.), followed by the name of the method (fullThrottle();
// and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.
//Remember that:
//The dot (.) is used to access the object's attributes and methods.
//To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
//A class must have a matching filename (Main and Main.java).

//Java Constructors
//A constructor in Java is a special method that is used to initialize objects.
//The constructor is called when an object of a class is created.
//It can be used to set initial values for object attributes:

/*
public class Car {
    int x; //create a class attribute

    //create a class constructor for the Car class
    public Car(int y) {
        x = y; //set the inital value for the class attribute x
    }

    public static void main(String[] args) {
        Car myCar = new Car(5); //create an object of class Main(this will call the constructor)
        System.out.println(myCar.x); //print the value of x
    }
}
*/

//Note that the constructor name must match the class name, and it cannot have a return type (like void).
//Also note that the constructor is called when the object is created.
//All classes have constructors by default: if you do not create a class constructor yourself,
//Java creates one for you. However, then you are not able to set initial values for object attributes.

/*
Access Modifiers

for classes
public - the class is accessible by any other class
default - the class is only accessible by classes in the same package. This is used ehrn you don't specify
a modifier

for attributes, methods and constructors
public - the code is accessible for all classes
private - the code is only accessible with the declared class
default - the code is only accessible in the same package - this is used when you don't specify a modifier
protected - the code is accessible in the same package and subclasses

Non-Access Modifiers

for classes
final - the class cannot be inherited by other classes
abstract - the class cannot be sed to create objects - to access an abstract class, it must be inherited
from another class

for attributes and methods
final - attributes and methods cannot be overridden/modified
static - attributes and methods belong to the class rather than an object
abstract - can only be used in an abstract class, and can only be used on methods - the method does not have a body,
           for example -- abstract void run() -- the body is provided by the subclass(inherited from)
transient - attributes and methods are skipped when serializing the object containing them
synchronized - methods can only be accessed by one thread at a time
volatile - the value of an attribute is not cached thread-locally, and is always read from the "main memory"

//--------------------------------------------------------------------------------------------------
//Static - a static method means that it can be accessed without creating an object of the class,
//unlike public

public class Car {

    //static method
    static void myStaticMethod () {
       System.out.println("Static methods can be called without creating objects.");
    }

    //public method
    public void myPublicMethod () {
        System.out.println("Public methods can be called by creating objects.");
    }

    //main method
    public static void main(String[] args) {
        myStaticMethod(); //call the static method
        // myPublicMethod(); //this would output an error

        Car myCar = new Car(); //create an object of main
        myCar.myPublicMethod(); //call the public method
    }
}
*/
//--------------------------------------------------------------------------------------------------

//code from filename: Car.java
//abstract class

abstract class Car {
    public String fname = "John ";
    public int age = 24;
    public abstract void study(); //abstract method
}

//subclass (inherit from Car)
class Student extends Car {
    public int graduationYear = 2018;
    public void study() {
        //the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
