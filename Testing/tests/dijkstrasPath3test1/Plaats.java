package dijkstrasPath3test1;

import java.util.*;

public class Plaats implements Comparator<Plaats> {
    public int node; 
    public int cost; 
   
    public Plaats() { 
    } 
    public Plaats(int i, int cost) 
    { 
        this.node = i; 
        this.cost = cost; 
    } 
  
    @Override
    public int compare(Plaats node1, Plaats node2) 
    { 
        if (node1.cost < node2.cost) 
            return -1; 
        if (node1.cost > node2.cost) 
            return 1; 
        return 0; 
    } 
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    private String name;
//    private List<Plaats> shortestPath = new LinkedList<>();
//    private Integer distance = Integer.MAX_VALUE;
//    Map<Plaats, Integer> adjacentNodes = new HashMap<>();
// 
//    public void addDestination(Plaats destination, int distance) {
//        adjacentNodes.put(destination, distance);
//    }
//  
//    public Plaats(String name) {
//        this.setName(name);
//    }
//
//	public List<Plaats> getShortestPath() {
//		return shortestPath;
//	}
//
//	public void setShortestPath(List<Plaats> shortestPath) {
//		this.shortestPath = shortestPath;
//	}
//
//	public Integer getDistance() {
//		return distance;
//	}
//
//	public void setDistance(Integer distance) {
//		this.distance = distance;
//	}
//
//	public Map<Plaats, Integer> getAdjacentNodes() {
//		return adjacentNodes;
//	}
//
//	public void setAdjacentNodes(Map<Plaats, Integer> adjacentNodes) {
//		this.adjacentNodes = adjacentNodes;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void addStap(Stap s) {
//		// TODO Auto-generated method stub
//		
//	}
//     
    
}
