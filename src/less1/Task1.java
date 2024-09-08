package less1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task1 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        // Define the format for DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");

        // Format the current date and time
        String formattedDateTime = now.format(formatter);

        Date date = new Date();
        System.out.println("date" + date);
        // Print the formatted date and time
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        System.out.println("Now: " + now);  // Prints the LocalDateTime object directly
    }
}
