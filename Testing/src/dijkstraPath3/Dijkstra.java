package dijkstraPath3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	private int distance;
	
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
                    distance = (int)minDistance;
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
        return path;
    }
    
    public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
