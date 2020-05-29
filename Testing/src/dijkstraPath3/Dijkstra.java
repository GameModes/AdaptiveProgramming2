package dijkstraPath3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    public void computePath(Vertex sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {
            Vertex vertex = priorityQueue.poll();

            for (Edge edge : vertex.getEdges()) {
                Vertex v = edge.getTargetVertex();
//                Vertex u = edge.getStartVertex();
                double weight = edge.getWeight();
                double minDistance = vertex.getMinDistance() + weight;

                if (minDistance < v.getMinDistance()) {
                    priorityQueue.remove(vertex);
                    v.setPreviosVertex(vertex);
                    v.setMinDistance(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVerte) {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = targetVerte; vertex != null; vertex = vertex.getPreviosVertex()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }
}
