package dijkstraPath3;

import java.util.ArrayList;
import java.util.List;

public class Plaats implements Comparable<Plaats> {
    private String name;
    private List<Stap> edges;
    private boolean visited;
    private Plaats previosVertex;
    private double minDistance = Double.MAX_VALUE;

    public Plaats(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public void addNeighbour(Stap edge) {
        this.edges.add(edge);
    }

    public List<Stap> getEdges() {
        return edges;
    }

    public void setEdges(List<Stap> edges) {
        this.edges = edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Plaats getPreviosVertex() {
        return previosVertex;
    }

    public void setPreviosVertex(Plaats previosVertex) {
        this.previosVertex = previosVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Plaats otherVertex) {
        return Double.compare(this.minDistance, otherVertex.minDistance);
    }
}