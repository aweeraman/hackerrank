import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fit {

    private int width = 0, height = 0;

    public void run() {
        Scanner scan = new Scanner(System.in);
        width = scan.nextInt();
        height = scan.nextInt();
        int numShapes = scan.nextInt();
        for (int i = 0; i < numShapes; i++) {
            String shape = scan.next();
            if ("R".equals(shape)) {
                int w = scan.nextInt();
                int h = scan.nextInt();
                System.out.println(checkRect(w, h));
            } else if ("C". equals(shape)) {
                int r = scan.nextInt();
                System.out.println(checkCircle(r));
            }
        }
    }

    public String checkRect(int w, int h) {
        int min = 0, max = 0;
        int minShape = 0, maxShape = 0;

        if (width < height) {
            min = width;
            max = height;
        } else {
            min = height;
            max = width;
        }

        if (w < h) {
            minShape = w;
            maxShape = h;
        } else {
            minShape = h;
            maxShape = w;
        }

        if (minShape > min) {
            return "NO";
        }

        if (maxShape > max) {
            return "NO";
        }

        return "YES";
    }

    public String checkCircle(int r) {
        int min = 0;
        if (width < height) {
            min = width;
        } else {
            min = height;
        }
        if (((int) (min / 2)) >= r) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        new Fit().run();
    }
}