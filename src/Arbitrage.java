import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arbitrage {

    public static double WALLET = 100000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            double usd2Eur = scan.nextDouble();
            double eur2Gpb = scan.nextDouble();
            double gbp2Usd = scan.nextDouble();

            double euros = WALLET / usd2Eur;
            double gpbs = euros / eur2Gpb;
            double usds = gpbs / gbp2Usd;

            int profit = (int) (usds - WALLET);
            if (profit > 0) {
                System.out.println(profit);
            } else {
                System.out.println("0");
            }
        }
    }
}