import java.util.Scanner;

public class SimpleLoop1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <=20; i++) {
            System.out.println(String.format("%d x %d = %d", n, i, n*i));
        }
    }
}
