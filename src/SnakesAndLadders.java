import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SnakesAndLadders {

    private static int LADDER_END = -150;
    private static int SNAKE_END = -200;

    public int findBestMoves(int[][] board) {
        int moves = 0;
        int dice = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (++dice == 6) {
                    moves++;
                    dice = 0;
                    System.out.println("rolled");
                }

                if (board[i][j] > 0) {
                    int num = board[i][j];
                    System.out.println(String.format("rolled %d %d", dice, num));
                    i = (num - 1) / 10;
                    j = (num - 1) % 10;
                    moves++;
                    dice = 0;
                }

                if (i == 9 && j == 9) {
                    System.out.println(String.format("end %d %d", dice, moves));
                }
            }
        }
        return moves;
    }

    public static void print(int[][] board) {
        System.out.println("----------------------------");
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.print(String.format("%4d ", board[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int[][] board = new int[10][10];
            int ladders = scan.nextInt();
            for (int l = 0; l < ladders; l++) {
                int from = scan.nextInt();
                int to = scan.nextInt();
                board[(from - 1)/ 10][(from - 1) % 10] = to;
                board[(to - 1)/ 10][(to - 1) % 10] = LADDER_END;
            }
            int snakes = scan.nextInt();
            for (int s = 0; s < snakes; s++) {
                int from = scan.nextInt();
                int to = scan.nextInt();
                board[(from - 1) / 10][(from - 1) % 10] = -to;
                board[(to - 1) / 10][(to - 1) % 10] = SNAKE_END;
            }
            print(board);
            System.out.println(new SnakesAndLadders().findBestMoves(board));
        }
        scan.close();
    }
}