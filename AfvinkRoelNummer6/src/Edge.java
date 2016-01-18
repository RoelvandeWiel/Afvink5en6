/**
 * Created by user on 17-1-2016.
 */
public class Edge {

    private Node from, to;
    private int weight;
    private static int count;

    public Edge (Node from, Node to) {

        this.from = from;
        this.to = to;
        this.weight = 3;

        count++;

    }

    public Node getFrom() {

        return from;

    }

    public Node getTo() {

        return to;

    }

    public int getWeight() {

        return weight;

    }

    public static int getCount() {

        return count;

    }

    public String toString() {

        return "{" + from + " " + to + "}";

    }
}
