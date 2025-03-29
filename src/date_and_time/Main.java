package date_and_time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now(); //create date object

        LocalTime mySecondObject = LocalTime.now(); //create time object

        LocalDateTime myThirdObject = LocalDateTime.now(); //create time object

        System.out.println((myObj)); //display the current date
        System.out.println((mySecondObject)); //display the current time
        System.out.println("Before formatting: " + myThirdObject); //display the current date time

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");

        String formattedDate = myThirdObject.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
