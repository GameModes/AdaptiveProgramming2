package dijkstraPath3;

public class App {

	public static void main(String[] args) {
		
        Plaats v1 = new Plaats("Amersfoort");
        Plaats v2 = new Plaats("Beusichem");
        Plaats v3 = new Plaats("Culemborg");
        Plaats v4 = new Plaats("Dordrecht");
        Plaats v5 = new Plaats("Enschede");
        Plaats v6 = new Plaats("Flevo");

        v1.addNeighbour(new TreinRit(5, v1, v2));
        v1.addNeighbour(new TreinRit(42, v1, v3));
        v1.addNeighbour(new TreinRit(412, v1, v4));
        v1.addNeighbour(new TreinRit(4, v1, v5));
        
        v2.addNeighbour(new TreinRit(41, v2, v1));
        v2.addNeighbour(new TreinRit(43, v2, v3));
        v2.addNeighbour(new TreinRit(45, v2, v4));
        v2.addNeighbour(new TreinRit(56, v2, v5));
        v2.addNeighbour(new TreinRit(6, v2, v6));
        
        v3.addNeighbour(new TreinRit(20, v3, v4));
        v3.addNeighbour(new TreinRit(17, v3, v4));
        v3.addNeighbour(new TreinRit(19, v3, v4));
        v3.addNeighbour(new TreinRit(42, v3, v4));
        v3.addNeighbour(new TreinRit(52, v3, v4));
        
        
        Dijkstra treinRit = new Dijkstra();
        treinRit.computePath(v1);
        Route treinroute = new Route();
        treinroute.setPath(treinRit.getShortestPathTo(v6));
        treinroute.setDistance(treinRit.getDistance());
        System.out.println(treinroute.toString());
        
    }

	}


