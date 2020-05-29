package dijkstraPath3;

public class Vlucht extends Stap {
	double tarief;
	
	public Vlucht(double afstand, Plaats startVertex, Plaats targetVertex) {
		super(startVertex, targetVertex);
		this.tarief = tarief;
	}

	@Override
	public double getWeight() {
		
		return tarief;
	}

	@Override
	public void setWeight(double weight) {
		tarief = weight;

		
	}

}
