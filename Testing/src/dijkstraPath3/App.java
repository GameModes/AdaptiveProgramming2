package dijkstraPath3;

public class App {

	public static void main(String[] args) {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");

        v1.addNeighbour(new Edge(1, v1, v2));
        v1.addNeighbour(new Edge(10, v1, v2));

        v2.addNeighbour(new Edge(1, v2, v3));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v3));
    }

	}


