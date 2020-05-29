package dijkstraPath3;

public abstract class Stap {
    private Plaats startVertex;
    private Plaats targetVertex;

    public Stap(Plaats startVertex, Plaats targetVertex) {
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public abstract double getWeight();

    public abstract void setWeight(double weight);

    public Plaats getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Plaats startVertex) {
        this.startVertex = startVertex;
    }

    public Plaats getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Plaats targetVertex) {
        this.targetVertex = targetVertex;
    }
}