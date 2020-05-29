package dijkstraPath3;

public class AutoRit extends Stap{
	double afstand;
	
	public AutoRit(double afstand, Plaats startVertex, Plaats targetVertex) {
		super(startVertex, targetVertex);
		this.afstand = afstand;
	}

	public double getWeight() {
		return afstand;
	}

	public void setWeight(double weight) {
		afstand = weight;

		
	}

}
