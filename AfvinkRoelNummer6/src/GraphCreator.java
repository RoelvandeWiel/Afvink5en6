/**
 * Created by user on 17-1-2016.
 */
import java.util.ArrayList;
import java.util.HashSet;


public class GraphCreator {

    private static Node[] nodes = new Node[5];

    public static void main(String[] args) {

        vulNodes();
        Graph graph = new Graph(nodes);

        for (int i = 0; i < nodes.length - 1; i++) {

            for (int j = i + 1; j < nodes.length; j++) {

                if (bepaalOverlap(nodes[i], nodes[j])) {

                    graph.addEdge(new Edge(nodes[i], nodes[j]));

                }
            }
        }

        HashSet<Edge> edges = graph.getEdges();

        for (Edge edge : edges) {

            System.out.println(edge.toString());

        }
    }

    private static void vulNodes() {

        nodes[0] = new Node("AAATAAA");
        nodes[1] = new Node("AAATTTT");
        nodes[2] = new Node("TTTTCCC");
        nodes[3] = new Node("AAATCCC");
        nodes[4] = new Node("GGGTGGG");

    }

    private static Boolean bepaalOverlap (Node from, Node to) {

        if (from.getSequentie().substring(from.getSequentie().length() - 3, from.getSequentie().length()).equals(to.getSequentie().substring(0, 3))) {

            return true;

        }

        return false;

    }
}