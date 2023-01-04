
import java.util.LinkedList;
import java.util.List;

public class Exercise2 {
    public enum State {
        Unvisited,
        Visited,
        Visiting;
    }

    public class Node {
        private List<Node> adjacentNodes;
        private int value;
        public State state;

        public List<Node> getAdjacent() {
            return adjacentNodes;
        }

        public Node(int v, List nodes) {
            value = v;
            adjacentNodes = nodes;
        }

        public void addAdjacent(Node n) {
            adjacentNodes.add(n);
        }
    }

    public class Graph {
        List<Node> connectedNodes;

        public Graph(List nodes) {
            connectedNodes = nodes;
        }

        public List<Node> getNodes() {
            return connectedNodes;
        }

        public void addNode(Node n) {
            connectedNodes.add(n);
        }
    }

    public static boolean searchPath(Graph g, Node start, Node end) {
        // operates as a Queue
        LinkedList<Node> q = new LinkedList<Node>();

        for (Node u: g.getNodes()) {
            u.state = State.Unvisited;
        }
        start.state = State.Visiting;
        q.add(start);
        Node u;

        while (!q.isEmpty()) {
            u = q.removeFirst(); // i.e dequeue
            if (u != null) {
                for (Node v: u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visiting;
            }
        }
        return false;
    }
}
