package AP2;

public class Schaap implements Zoogdier {
	private String naam = "henk";
	
	public Schaap (String n) {
		this.naam = n;
	}
	public String toString() {
		return this.naam;
	}



	@Override
	public double eet() {
		return 0;
	}
	
	public void sterf() {
		
	}		

	@Override
	public void reproduceer() {
		// TODO Auto-generated method stub
		
	}
}