import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        StringBuffer even;
        StringBuffer odd;
        for (int i = 0; i < tests; i++) {
            even = new StringBuffer();
            odd = new StringBuffer();
            String line = scan.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (j % 2 == 0) {
                    even.append(line.charAt(j));
                } else {
                    odd.append(line.charAt(j));
                }
            }
            System.out.println(String.format("%s %s", even.toString(), odd.toString()));
        }
    }
}