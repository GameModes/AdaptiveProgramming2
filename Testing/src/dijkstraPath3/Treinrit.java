package dijkstraPath3;

public class Treinrit extends Stap{
	double tijd;
	
	public Treinrit(double afstand, Plaats startVertex, Plaats targetVertex) {
		super(startVertex, targetVertex);
		this.tijd = tijd;
	}

	public double getWeight() {
		return tijd;
	}

	public void setWeight(double weight) {
		tijd = weight;	
	}

}
