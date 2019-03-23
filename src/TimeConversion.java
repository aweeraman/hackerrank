import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int hour = Integer.parseInt(time.substring(0, 2));
        if (time.endsWith("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour = 12 + hour;
            }
        }
        System.out.println(String.format("%02d", hour) + time.substring(2, time.length() - 2));
    }
}
