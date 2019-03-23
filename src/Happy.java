import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Happy {

    private int a = 0, b = 0, c = 0;

    public void run() {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int numberOrders = scan.nextInt();

        scan.nextLine();

        List<String[]> list = new ArrayList<String[]>();

        for (int i = 0; i < numberOrders; i++) {
            String line = scan.nextLine();
            String[] products = line.split(",");
            list.add(products);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                //String[] products = list.toArray();
            }
        }

        //System.out.println(orders);
    }

    public int runPermutations(List<String[]> list) {
        int orders = 0;

        for (int i = 1; i <= 3; i++) {
            for (String[] products : list) {
                if (products.length == i) {
                    int aa = 0, bb = 0, cc = 0;
                    for (int j = 0; j < products.length; j++) {
                        if (products[j].equals("A")) {
                            aa = 1;
                        } else if (products[j].equals("B")) {
                            bb = 1;
                        } else if (products[j].equals("C")) {
                            cc = 1;
                        }
                    }
                    if (hasInventory(aa, bb, cc)) {
                        decrementInventory(aa, bb, cc);
                        orders++;
                    }
                }
            }
        }
        return 0;
    }

    public boolean hasInventory(int a, int b, int c) {
        boolean successA = false, successB = false, successC = false;

        if (a > 0) {
            if (this.a - a >= 0) {
                successA = true;
            }
        } else {
            successA = true;
        }

        if (b > 0) {
            if (this.b - b >= 0) {
                successB = true;
            }
        } else {
            successB = true;
        }

        if (c > 0) {
            if (this.c - c >= 0) {
                successB = true;
            }
        } else {
            successC = true;
        }

        return successA && successB && successC;
    }

    public void decrementInventory(int a, int b, int c) {

        if (a > 0) {
            this.a -= a;
        }

        if (b > 0) {
            this.b -= b;
        }

        if (c > 0) {
            this.c -= c;
        }
    }

    public static void main(String[] args) {
        new Happy().run();
    }
}