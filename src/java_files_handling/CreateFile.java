package java_files_handling;

import java.io.File; //import the File class
import java.io.IOException; //import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\User\\OneDrive\\Desktop\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
