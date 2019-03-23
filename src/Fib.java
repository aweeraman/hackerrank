import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fib {

    public BigInteger fib(int n, int a, int b) {
        if (n == 1) {
            return new BigInteger(String.valueOf(a));
        }
        if (n == 2) {
            return new BigInteger(String.valueOf(b));
        }
        return fib(n - 1, a, b).multiply(fib(n - 1, a, b)).add(fib(n - 2, a, b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(new Fib().fib(n, a, b).toString());
    }
}