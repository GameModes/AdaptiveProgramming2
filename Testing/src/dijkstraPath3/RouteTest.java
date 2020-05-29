package dijkstraPath3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RouteTest {

	@Test
	public void test() {
        Plaats v1 = new Plaats("Amersfoort");
        Plaats v2 = new Plaats("Culemborg");
        Plaats v3 = new Plaats("Beuschium");

        v1.addNeighbour(new AutoRit(2, v1, v2));
        v1.addNeighbour(new AutoRit(8, v1, v3));
        v2.addNeighbour(new AutoRit(2, v2, v3));
        

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);
        Route route = new Route();
        System.out.println(route.getShortestPathTo(v3));
	}

}
