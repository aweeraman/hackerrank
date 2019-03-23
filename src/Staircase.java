import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j <= i; j++) {
                buffer.append("#");
            }
            System.out.println(String.format("%" + n + "s", buffer.toString()));
        }
    }
}
