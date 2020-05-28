package dijkstrasPath3;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class KaartJtest {

	@Test
	public void test() {
		Plaats nodeA = new Plaats("A");
		Plaats nodeB = new Plaats("B");
		Plaats nodeC = new Plaats("C");
		Plaats nodeD = new Plaats("D"); 
		Plaats nodeE = new Plaats("E");
		Plaats nodeF = new Plaats("F");
//		 
//		Stap s = new Rit(10, nodeB);
//		Stap s = new Vlucht(10, nodeB);
		
//		nodeA.addStap(s);
		
		nodeA.addDestination(nodeC, 15);
		 
		nodeB.addDestination(nodeD, 12);
		nodeB.addDestination(nodeF, 15);
		 
		nodeC.addDestination(nodeE, 10);
		 
		nodeD.addDestination(nodeE, 2);
		nodeD.addDestination(nodeF, 10);
		 
		nodeF.addDestination(nodeE, 5);
		 
		Kaart graph = new Kaart();
		 
		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);
		 
		Kaart r = Kaart.calculateShortestPathFromSource(graph, nodeA);
		List<Plaats> m = nodeC.getShortestPath();
//		
		System.out.println(Kaart.calculateShortestPathFromSource(graph, nodeA));
		System.out.println(nodeC.getShortestPath());
		System.out.println(nodeC.getDistance()); 
	}

}
