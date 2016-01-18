/**
 * Created by user on 17-1-2016.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private HashMap<String, Node> nodes;
    private HashMap<Integer, Edge> edges;

    public Graph(Node[] nodes) {

        this.edges = new HashMap<Integer, Edge>();
        this.nodes = new HashMap<String, Node>();

        for (Node node : nodes) {

            this.nodes.put(node.getSequentie(), node);

        }
    }

    public void addEdge(Edge edge) {

        edges.put(Edge.getCount(), edge);

    }

    public HashSet<Edge> getEdges() {

        return new HashSet<Edge>(this.edges.values());

    }
}