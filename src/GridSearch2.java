import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GridSearch2 {

    public static class Node {
        public int x, y;
        public char z;

        public Node(int x, int y, char z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public String toString() {
            return String.format("%d, %d, %c", x, y, z);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            char[] array;
            char[][] matrix = new char[R][C];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
                array = G[G_i].toCharArray();
                for (int k = 0; k < array.length; k++) {
                    matrix[G_i][k] = array[k];
                }
            }

            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];

            List<Node> list = new LinkedList<Node>();
            for(int P_i=0; P_i < r; P_i++) {
                P[P_i] = in.next();
                array = P[P_i].toCharArray();
                for (int i = 0; i < array.length; i++) {
                    Node node = new Node(P_i, i, array[i]);
                    list.add(node);
                }
            }

            boolean patternFound = false;

            outer:
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (patternCheck(list, matrix, i, j, R, C)) {
                        System.out.println("YES");
                        patternFound = true;
                        break outer;
                    }
                }
            }

            if (! patternFound) {
                System.out.println("NO");
            }
        }
    }

    public static boolean patternCheck(List<Node> list, char[][] matrix, int i, int j, int R, int C) {
        for (Node node: list) {
            int k = i + node.x;
            int l = j + node.y;
            if (k >= R || l >= C || node.z != matrix[k][l]) {
                return false;
            }
        }
        return true;
    }
}
