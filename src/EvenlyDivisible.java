import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenlyDivisible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        Set<Integer> remove = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((a[i] + a[j]) % k) != 0) {
                    if (i != j) {
                        remove.add(a[i]);
                        System.out.println(String.format("%d %d", a[i], a[j]));
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!remove.contains(a[i])) {
                System.out.println(a[i]);
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean evenlyDivisible(Set<Integer> subset, int x, int y, int k) {
        Object[] objArray = subset.toArray();
        Integer[] subsetInts = Arrays.copyOf(objArray, objArray.length, Integer[].class);

        for (int i = 0; i < subsetInts.length; i++) {
            if (((x + subsetInts[i] % k) == 0) || ((y + subsetInts[i] % k) == 0)) {
                return true;
            }
        }

        return false;
    }
}
