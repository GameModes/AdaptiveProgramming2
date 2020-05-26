package dijkstrasPath3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReisJtest {

	@Test
	public void test() {
		Plaats nodeA = new Plaats("A");
		Plaats nodeB = new Plaats("B");
		Plaats nodeC = new Plaats("C");
		Plaats nodeD = new Plaats("D"); 
		Plaats nodeE = new Plaats("E");
		Plaats nodeF = new Plaats("F");
		 
		nodeA.addDestination(nodeB, 10);
		nodeA.addDestination(nodeC, 15);
		 
		nodeB.addDestination(nodeD, 12);
		nodeB.addDestination(nodeF, 15);
		 
		nodeC.addDestination(nodeE, 10);
		 
		nodeD.addDestination(nodeE, 2);
		nodeD.addDestination(nodeF, 1);
		 
		nodeF.addDestination(nodeE, 5);
		 
		Reis graph = new Reis();
		 
		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);
		 
		System.out.println(graph.calculateShortestPathFromSource(graph, nodeA));
		
	}

}
