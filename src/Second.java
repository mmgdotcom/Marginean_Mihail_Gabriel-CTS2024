public class Second {

    //static method - can be accessed without creating an object of the class
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects!");
    }

    //public method - can only be accessed by objects
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects!");
    }

    public static void main(String[] args) {
        //MyMain myObj1 = new MyMain();
        //MyMain myObj2 = new MyMain();
        //myObj2.x = 40;
        //System.out.println(myObj1.x);
        //System.out.println(myObj2.x);

        myStaticMethod(); //call the static method;
        //myPublicMethod(); //this would compile an error

        Second myObj = new Second(); //create an object of "Second" class
        myObj.myPublicMethod(); //Call the public method on the object

    }
}
