package interfaces;

//an interface is a completely "abstract class" that is used to group related methods with empty bodies
interface Animal {
    public void animalSound(); //interface method (does not have a body)
    public void sleep();
}

//to sacces the interface methods, the interface must be "implemented" (kinda like inherited) by another class
//with the "implements" keyword (instead of "extends"). The body of the interface method is provided by the "implement" class.

//Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: weeee wee"); //the body of animalSound() is provided here
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); //create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

/*
Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to
create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).
2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).
*/


