package dijkstraPath3;

public class App {

	public static void main(String[] args) {
        Plaats v1 = new Plaats("A");
        Plaats v2 = new Plaats("B");
        Plaats v3 = new Plaats("C");

        v1.addNeighbour(new AutoRit(1, v1, v2));
        v1.addNeighbour(new AutoRit(10, v1, v2));

        v2.addNeighbour(new AutoRit(1, v2, v3));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v3));
        System.out.println(dijkstra.getShortestPathTo(v3));
    }

	}


