import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InquiringManager {

    class Node {
        public int time;
        public int price;

        public Node(String price, String time) {
            this.time = Integer.parseInt(time);
            this.price = Integer.parseInt(price);
        }
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        int numberOfEvents = scan.nextInt();
        scan.nextLine();

        List<Node> list = new ArrayList<Node>();

        for (int i = 0; i < numberOfEvents; i++) {
            String line = scan.nextLine();
            String[] event = line.split(" ");

            if (event[0].equals("1")) {
                list.add(new Node(event[1], event[2]));
            } else if (event[0].equals("2")) {
                System.out.println(inquire(list, Integer.parseInt(event[1])));
            }
        }
    }

    public int inquire(List<Node> list, int time) {
        int endTime = time;
        int startTime = endTime - 59;
        if (startTime < 0) {
            startTime = 0;
        }

        int max = -1;
        Node[] nodes = new Node[list.size()];
        nodes = list.toArray(nodes);

        for (int i = nodes.length - 1; i >= 0; i--) {
            Node node = nodes[i];
            if ((node.time >= startTime) && (node.time <= endTime)) {
                if (node.price > max) {
                    max = node.price;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new InquiringManager().run();
    }
}