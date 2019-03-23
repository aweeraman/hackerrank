import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Shoes {

    class ArrayComparator implements Comparator<Comparable[]> {
        private boolean ascending;
        private int column;

        public ArrayComparator(boolean ascending, int column) {
            this.ascending = ascending;
            this.column = column;
        }

        public int compare(Comparable[] c1, Comparable[] c2) {
            int cmp = c1[column].compareTo(c2[column]);
            return ascending ? cmp : -cmp;
        }
    }

    public void checkPopularity() {
        Scanner scan = new Scanner(System.in);

        int numberOfRecommendations = scan.nextInt();
        int distinctShoes = scan.nextInt();
        int orderNumber = scan.nextInt();

        Integer[][] shoes = new Integer[distinctShoes][2];

        for (int i = 0; i < orderNumber; i++) {
            int shoeNumber = scan.nextInt();
            shoes[shoeNumber][0] = shoeNumber;
            if (shoes[shoeNumber][1] == null) {
                shoes[shoeNumber][1] = 1;
            } else {
                shoes[shoeNumber][1]++;
            }
        }

        Arrays.sort(shoes, new ArrayComparator(false, 1));

        for (int k = 0; k < numberOfRecommendations; k++) {
            System.out.println(shoes[k][0]);
        }
    }

    public static void main(String[] args) {
        new Shoes().checkPopularity();
    }
}