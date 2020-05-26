package dijkstrasPath3;

import java.util.*;
import java.util.Map.Entry;

public class Reis {
    private Set<Plaats> nodes = new HashSet<>();
    
    public void addNode(Plaats nodeA) {
        nodes.add(nodeA);
    }
    

	public Set<Plaats> getNodes() {
		return nodes;
	}

	public void setNodes(Set<Plaats> nodes) {
		this.nodes = nodes;
	}
 
	public static Reis calculateShortestPathFromSource(Reis graph, Plaats source) {
	    source.setDistance(0);
	 
	    Set<Plaats> settledNodes = new HashSet<>();
	    Set<Plaats> unsettledNodes = new HashSet<>();
	 
	    unsettledNodes.add(source);
	 
	    while (unsettledNodes.size() != 0) {
	    	Plaats currentNode = getLowestDistanceNode(unsettledNodes);
	        unsettledNodes.remove(currentNode);
	        for (Entry<Plaats, Integer> adjacencyPair: 
	          currentNode.getAdjacentNodes().entrySet()) {
	        	Plaats adjacentNode = adjacencyPair.getKey();
	            Integer edgeWeight = adjacencyPair.getValue();
	            if (!settledNodes.contains(adjacentNode)) {
	                calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
	                unsettledNodes.add(adjacentNode);
	            }
	        }
	        settledNodes.add(currentNode);
	    }
	    return graph;
	}
	
	private static Plaats getLowestDistanceNode(Set < Plaats > unsettledNodes) {
		Plaats lowestDistanceNode = null;
	    int lowestDistance = Integer.MAX_VALUE;
	    for (Plaats node: unsettledNodes) {
	        int nodeDistance = node.getDistance();
	        if (nodeDistance < lowestDistance) {
	            lowestDistance = nodeDistance;
	            lowestDistanceNode = node;
	        }
	    }
	    return lowestDistanceNode;
	}
	
	private static void calculateMinimumDistance(Plaats evaluationNode, Integer edgeWeigh, Plaats sourceNode) {
			    Integer sourceDistance = sourceNode.getDistance();
			    if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
			        evaluationNode.setDistance(sourceDistance + edgeWeigh);
			        LinkedList<Plaats> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
			        shortestPath.add(sourceNode);
			        evaluationNode.setShortestPath(shortestPath);
			    }
			}
	
}
