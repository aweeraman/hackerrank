import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        for (int test = 0; test < testcases; test++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int k = 1; k <= n; k++) {
                int sum = a + b;
                for (int j = 1; j < k; j++) {
                    sum += Math.pow(2, j) * b;
                }
                System.out.print(sum);
                if (k < n) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}