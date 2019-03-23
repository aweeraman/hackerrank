import java.util.*;

public class HappyLadybugs {
    public HappyLadybugs() {}

    public void happy(String str) {
        boolean happy = false;

OUTER:
        do {
            if (str.length() < 2) {
                break;
            }

            int underscoreCount = 0;
            Map<Character, Integer> tokens = new HashMap<Character, Integer>();
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c != '_') {
                    Integer count = tokens.get(c);
                    if (count == null) {
                        tokens.put(c, 1);
                    } else {
                        count++;
                        tokens.put(c, count);
                    }
                } else {
                    underscoreCount++;
                }
            }

            for (Map.Entry<Character, Integer> entry: tokens.entrySet()) {
                Integer value = entry.getValue();
                if (value == 1) {
                    happy = false;
                    break OUTER;
                }
            }

            if (tokens.size() > 0) {
                break;
            }

            if (underscoreCount > 1) {
                happy = true;
                break;
            }

            Set<Character> tokens2 = new HashSet<Character>();
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c != '_') {
                    tokens2.add(c);
                }
            }

            if (tokens2.size() == 0) {
                happy = false;
            }

        } while (false);

        if (happy) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        int happies = scanner.nextInt();
        for (int i = 0; i < happies; i++) {
            int length = scanner.nextInt();
            scanner.nextLine();
            String line = scanner.nextLine();
            String str = line.substring(0, length);
            happy(str);
        }
    }

    public void t(String str, String expected) {
        System.out.print(str + " (" + expected + ")");
        happy(str);
    }

    public void test() {
        t("_", "NO");
        t("RBY_YBR", "YES");
        t("X_Y__X", "NO");
        t("__", "YES");
        t("B_RRBR", "YES");
    }

    public static void main(String[] args) {
        new HappyLadybugs().process();
    }
}
