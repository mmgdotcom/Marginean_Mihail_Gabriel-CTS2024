package java_threads;

//There are two ways to create a thread.
////1. It can be created by extending the Thread class and overriding its run() method:

//public class Main extends Thread{
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }
//}

////2. Another way ti create a thread is to implement the Runnable interface:
//public class Main implements Runnable{
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }
//}

////If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
//public class Main extends Thread{
//    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        System.out.println("This code is outside of the thread");
//    }
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }
//}

////If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread
////object's constructor and then calling the thread's start() method:
//public class Main implements Runnable {
//    public static void main(String[] args) {
//        Main obj = new Main();
//        Thread thread = new Thread(obj);
//        thread.start();
//        System.out.println("This code is outside of the thread");
//    }
//
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }
//}

//Differences between "extending" and "implementing" Threads
//The major difference is that when a class extends the Thread class, you cannot extend any other class,
//but by implementing the Runnable interface, it is possible to extend from another class as well, like:
//class MyClass extends OtherClass implements Runnable.

//Concurency problems
//Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run.
//When the threads and main program are reading and writing the same variables, the values are unpredictable.
//The problems that result from this are called concurrency problems.

////A code example where the values of the variable amount is unpredictable:
//public class Main extends Thread {
//    public static int amount = 0;
//    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);
//    }
//
//    public void run() {
//        amount++;
//    }
//}

//To avoid concurrency problems, it is best to share as few attributes between threads as possible.
//If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to
//check whether the thread has finished running before using any attributes that the thread can change.

public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();

        //wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        //update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}


