package dijkstraPath3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RouteTestVluchtEnTrein {

	@Test
	public void test() {
        Plaats v1 = new Plaats("A");
        Plaats v2 = new Plaats("B");
        Plaats v3 = new Plaats("C");
        Plaats v4 = new Plaats("D");
        Plaats v5 = new Plaats("E");
        Plaats v6 = new Plaats("F");

        //cirkeltest
        //1 -1> 2 -6> 3 -9> 4 (16) of 1 -2> 6 -8> 5 -7> 4 (17)
        v1.addNeighbour(new TreinRit(1, v1, v2));
        v2.addNeighbour(new TreinRit(6, v2, v3));
        v3.addNeighbour(new TreinRit(9, v3, v4));
        
        v1.addNeighbour(new TreinRit(2, v1, v6));
        v6.addNeighbour(new TreinRit(8, v6, v5));
        v5.addNeighbour(new TreinRit(7, v5, v4));
        
        

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);
        Route route = new Route();
        route.setPath(dijkstra.getShortestPathTo(v4));
        route.setDistance(dijkstra.getDistance());
        System.out.println(route.toString());
	}

}
