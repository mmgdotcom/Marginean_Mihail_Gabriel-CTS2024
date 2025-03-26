package encapsulation;

//public class Person {
//    private String name; //private = restricted access
//
//    //getter
//    public String getName() {
//        return name;
//    }
//
//    //setter
//    public void setName(String newName) {
//        this.name = newName;
//    }
//}

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        //myObj.name = "John"; //error
        myObj.setName("John"); //set the value of the name variable to "John"
        //System.out.println(myObj.name); //error
        System.out.println(myObj.getName()); //error
    }
}
