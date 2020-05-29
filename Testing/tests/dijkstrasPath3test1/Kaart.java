package dijkstrasPath3test1;

import java.util.*;
import java.util.Map.Entry;
import java.util.HashSet;
import java.util.Set;
public class Kaart{
    private int dist[]; 
    private Set<Integer> settled; 
    private PriorityQueue<Plaats> pq; 
    private int V; // Number of vertices 
    List<List<Plaats> > adj;
    
public Kaart (int V){
    this.V = V; 
    dist = new int[V]; 
    settled = new HashSet<Integer>(); 
    pq = new PriorityQueue<Plaats>(V, new Plaats()); 
}

public int[] getDist() {
	return dist;
}

public void setDist(int[] dist) {
	this.dist = dist;
}

//Source: https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-in-java-using-priorityqueue/
//Team: Guy, Koen (voor motivatie)
// Function for Dijkstra's Algorithm 
public void dijkstra(List<List<Plaats> > adj, int src) 
{ 
    this.adj = adj; 

    for (int i = 0; i < V; i++) 
        dist[i] = Integer.MAX_VALUE; 

    // Add source node to the priority queue 
    pq.add(new Plaats(src, 0)); 

    // Distance to the source is 0 
    dist[src] = 0; 
    while (settled.size() != V) { 

        // remove the minimum distance node  
        // from the priority queue  
        int u = pq.remove().node; 

        // adding the node whose distance is 
        // finalized 
        settled.add(u); 

        e_Neighbours(u); 
    } 
} 

// Function to process all the neighbours  
// of the passed node 
private void e_Neighbours(int u) { 
    int edgeDistance = -1; 
    int newDistance = -1; 

    // All the neighbors of v 
    for (int i = 0; i < adj.get(u).size(); i++) { 
        Plaats v = adj.get(u).get(i); 

        // If current node hasn't already been processed 
        if (!settled.contains(v.node)) { 
            edgeDistance = v.cost; 
            newDistance = dist[u] + edgeDistance; 

            // If new distance is cheaper in cost 
            if (newDistance < dist[v.node]) 
                dist[v.node] = newDistance; 

            // Add the current node to the queue 
            pq.add(new Plaats(v.node, dist[v.node])); 
        } 
    } 
} 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    private Set<Plaats> nodes = new HashSet<>();
//    
//    public void addNode(Plaats nodeA) {
//        nodes.add(nodeA);
//    }
//    
//
//	public Set<Plaats> getNodes() {
//		return nodes;
//	}
//
//	public void setNodes(Set<Plaats> nodes) {
//		this.nodes = nodes;
//	}
// 
//	public static Kaart calculateShortestPathFromSource(Kaart graph, Plaats source) {
//	    source.setDistance(0);
//	    Set<Plaats> settledNodes = new HashSet<>();
//	    Set<Plaats> unsettledNodes = new HashSet<>();
//	    unsettledNodes.add(source);
//	 
//	    while (unsettledNodes.size() != 0) {
//	    	Plaats currentNode = getLowestDistanceNode(unsettledNodes);
//	        unsettledNodes.remove(currentNode);
//	        for (Entry<Plaats, Integer> adjacencyPair: 
//	          currentNode.getAdjacentNodes().entrySet()) {
//	        	Plaats adjacentNode = adjacencyPair.getKey();
//	            Integer edgeWeight = adjacencyPair.getValue();
//	            if (!settledNodes.contains(adjacentNode)) {
//	                calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
//	                unsettledNodes.add(adjacentNode);
//	            }
//	        }
//	        settledNodes.add(currentNode);
//	    }
//	    return graph;
//	}
//	
//	private static Plaats getLowestDistanceNode(Set < Plaats > unsettledNodes) {
//		Plaats lowestDistanceNode = null;
//	    int lowestDistance = Integer.MAX_VALUE;
//	    for (Plaats node: unsettledNodes) {
//	        int nodeDistance = node.getDistance();
//	        if (nodeDistance < lowestDistance) {
//	            lowestDistance = nodeDistance;
//	            lowestDistanceNode = node;
//	        }
//	    }
//	    return lowestDistanceNode;
//	}
//	
//	private static void calculateMinimumDistance(Plaats evaluationNode, Integer edgeWeigh, Plaats sourceNode) {
//			    Integer sourceDistance = sourceNode.getDistance();
//			    if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
//			        evaluationNode.setDistance(sourceDistance + edgeWeigh);
//			        LinkedList<Plaats> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
//			        shortestPath.add(sourceNode);
//			        evaluationNode.setShortestPath(shortestPath);
//			    }
//			}
//	
//	private static Object calculateLowestJourney(Kaart helekaart) {
//		
//		return null;
//		
//	}
	
}
