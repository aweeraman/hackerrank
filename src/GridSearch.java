import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GridSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }

            boolean match = false;
            int matchRow = 0;
            int matchCol = 0;
            boolean success = false;
            for (int row = 0; row < R; row++) {
                String rowStr = G[row].toString();
                String matchStr = P[matchRow].toString();
                int matchIndex = rowStr.indexOf(matchStr);
                if (matchIndex >= 0) {
                    if (match == false) {
                        match = true;
                        matchCol = matchIndex;
                    } else {
                        if (!(match && matchIndex == matchCol)) {
                            match = false;
                            matchCol = 0;
                        }
                    }
                } else {
                    match = false;
                }
                if (match) {
                    matchRow++;
                    if (matchRow == P.length) {
                        success = true;
                        break;
                    }
                } else {
                    matchRow = 0;
                }
            }
            if (success) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
