package dijkstraPath3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RouteTestAuto {

	@Test
	public void test() {
        Plaats v1 = new Plaats("Amersfoort");
        Plaats v2 = new Plaats("Beusichem");
        Plaats v3 = new Plaats("Culemborg");
        Plaats v4 = new Plaats("Dordrecht");
        Plaats v5 = new Plaats("Enschede");
        Plaats v6 = new Plaats("Flevo");

        //cirkeltest
        //1 -1> 2 -6> 3 -9> 4 (16) of 1 -2> 6 -8> 5 -7> 4 (17)
        //Autorit(afstand in km, plek1, plek 2)	
        v1.addNeighbour(new AutoRit(1, v1, v2));
        v2.addNeighbour(new AutoRit(6, v2, v3));
        v3.addNeighbour(new AutoRit(9, v3, v4));
        
        v1.addNeighbour(new AutoRit(200, v2, v6));
        v6.addNeighbour(new AutoRit(8, v6, v5));
        v5.addNeighbour(new AutoRit(7, v5, v4));
        
        Dijkstra autorit = new Dijkstra();
        autorit.computePath(v1);
        Route autoroute = new Route();
        autoroute.setPath(autorit.getShortestPathTo(v4));
        autoroute.setDistance(autorit.getDistance());
        System.out.println(autoroute.toString());

	}

}
