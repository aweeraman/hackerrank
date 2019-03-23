import java.util.Scanner;

public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int acount = 0;
        int bcount = 0;

        for (int i = 0; i < m; i++) {
            int d = scanner.nextInt();
            int pos = a + d;
            if (pos >= s && pos <= t) {
                acount++;
            }
        }

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            int pos = b + d;
            if (pos >= s && pos <= t) {
                bcount++;
            }
        }

        System.out.println(acount);
        System.out.println(bcount);
    }
}
