package dijkstraPath3;

public class AutoRit extends Stap{
	double afstand;
	
	public AutoRit(double afstand, Plaats startVertex, Plaats targetVertex) {
		super(startVertex, targetVertex);
		this.afstand = afstand;
	}

	@Override
	public double getWeight() {
		
		return afstand;
	}

	@Override
	public void setWeight(double weight) {
		afstand = weight;

		
	}

}
