package user_input;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name and press 'Enter': ");
        //string input
        String name = myObj.nextLine();


        System.out.println("Enter age and press 'Enter': ");
        //numerical input
        int age = myObj.nextInt();
        System.out.println("Enter salary and press 'Enter': ");
        double salary = myObj.nextInt();

        //output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
