package exceptions_try_catch;

//When executing Java code, different errors can occur: coding errors made by the programmer,
//errors due to wrong input, or other unforeseeable things.
//When an error occurs, Java will normally stop and generate an error message.
//The technical term for this is: Java will throw an exception (throw an error).

//Java try and catch
//The try statement allows you to define a block of code to be tested for errors while it is being executed.
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//The try and catch keywords come in pairs:
/*
    try {
      //  Block of code to try
    }
    catch(Exception e) {
      //  Block of code to handle errors
    }
*/

public class Main {

    /*
    The throw statement allows you to create a custom error.
    The throw statement is used together with an exception type.
    There are many exception types available in Java: ArithmeticException,
    FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
    Example: Throw an exception if age is below 18 (print "Access denied").
    If age is 18 or older, print "Access granted"
    */
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough");
        }
    }

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); //error!
        }
        catch (Exception e) {
            System.out.println("Soemthing went wrong");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        checkAge(20); //set age to 20 (which is above 18)
        checkAge(15); //set age to 15 (which is below 18)
    }
}
