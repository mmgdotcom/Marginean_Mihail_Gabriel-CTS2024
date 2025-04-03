package java_lambda_expressions;
import java.util.ArrayList;
import java.util.function.Consumer;

/*
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        //numbers.forEach( (n) -> {System.out.println(n);}); //inline use for Lambda
        Consumer<Integer> method = (n) -> {System.out.println(n);}; //introducing a Consumer functional interface
        numbers.forEach(method);

        //Reusability example
        //Let’s say you want to print multiple lists the same way:
        //Consumer<Integer> printNumber = (n) -> System.out.println(n);
        //numbers.forEach(printNumber);
        //someOtherList.forEach(printNumber);
    }
}
*/

//create a method which takes a lambda expression as a parameter
interface StringFunction {
    String run(String str);
}

public class Main {

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
}
