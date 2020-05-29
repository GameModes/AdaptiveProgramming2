package dijkstraPath3;

public class App {

	public static void main(String[] args) {
        Plaats v1 = new Plaats("Amersfoort");
        Plaats v2 = new Plaats("Culemborg");
        Plaats v3 = new Plaats("Beuschium");

        v1.addNeighbour(new AutoRit(2, v1, v2));
        v1.addNeighbour(new AutoRit(2, v1, v3));
        v2.addNeighbour(new AutoRit(2, v2, v3));
        

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v3));

    }

	}


