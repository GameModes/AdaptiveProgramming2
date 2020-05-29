package dijkstraPath3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.*;

public class Dijkstra {
	private Double distance;
	HashMap<Plaats, Double> plaatsen = new HashMap<Plaats, Double>();
	
    public void computePath(Plaats sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<Plaats> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        


       
        while (!priorityQueue.isEmpty()) {
            Plaats vertex = priorityQueue.poll();

            for (Stap edge : vertex.getEdges()) {
                Plaats v = edge.getTargetVertex();
//                Vertex u = edge.getStartVertex();
                double weight = edge.getWeight();
                double minDistance = vertex.getMinDistance() + weight;

                if (minDistance < v.getMinDistance()) {
                	
                    priorityQueue.remove(vertex);
                    v.setPreviosVertex(vertex);
                    v.setMinDistance(minDistance);
//                    System.out.println(v);
//                    System.out.println(minDistance);
                    plaatsen.put(v, minDistance);
                    priorityQueue.add(v);

                }
            }
        }
    }
    
    public List<Plaats> getShortestPathTo(Plaats targetVerte) {
        List<Plaats> path = new ArrayList<>();
        
        for (Plaats vertex = targetVerte; vertex != null; vertex = vertex.getPreviosVertex()) {
        	path.add(vertex);
        }
        Collections.reverse(path);
        
        for (Entry<Plaats, Double> entry : plaatsen.entrySet()) {//haalt de distance van de plaats uit de hashmap
            if (entry.getKey()  == path.get(path.size() - 1)) {
            distance = entry.getValue();
            }
        }
        return path;
    }
    
    
    public Double getDistance() {
    	
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
}
