package dijkstrasPath3;

import java.util.*;

public class Plaats {
    private String name;
    private List<Plaats> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    Map<Plaats, Integer> adjacentNodes = new HashMap<>();
 
    public void addDestination(Plaats destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
  
    public Plaats(String name) {
        this.name = name;
    }

	public List<Plaats> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(List<Plaats> shortestPath) {
		this.shortestPath = shortestPath;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Map<Plaats, Integer> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(Map<Plaats, Integer> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}
     
    
}
