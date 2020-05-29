package dijkstraPath3;

public class TreinRit extends Stap{
	double tijd;
	
	public TreinRit(double tijd, Plaats startVertex, Plaats targetVertex) {
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
