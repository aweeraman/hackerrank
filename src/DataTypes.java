import java.util.Scanner;

/**
 * Created by anuradha on 5/17/16.
 */
public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();

        int x = Integer.parseInt(line1) + i;
        double y = Double.parseDouble(line2) + d;
        String z = s.concat(line3);

        System.out.println(x);
        System.out.println(String.format("%.1f", y));
        System.out.println(z);

        scan.close();
    }
}
