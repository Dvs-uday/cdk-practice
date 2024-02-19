// we have to import java.time.* because we dont have built in date class

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Current date is " + d);

        LocalTime t = LocalTime.now();
        System.out.println("Current time is " + t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current date and time is " + dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String s = dt.format(f);
        System.out.println(s);
    }
}
