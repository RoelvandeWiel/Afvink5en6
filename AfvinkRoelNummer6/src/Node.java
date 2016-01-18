/**
 * Created by user on 17-1-2016.
 */
public class Node {

    private String sequentie;

    public Node (String sequentie) {

        this.sequentie = sequentie;

    }

    public String getSequentie() {

        return sequentie;

    }

    public String toString() {

        return "Node " + sequentie;

    }

    public Boolean equals (Node node) {

        return sequentie.equals(node.sequentie);

    }
}
