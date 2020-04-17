package F1;

public class Auto {
	String type;
	double prijsPerDag;
	
	public Auto(String tp, double prPd) {
		type = tp;
		prijsPerDag = prPd;
		
	}
	
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	
	public void setPrijsPerDag(double prPd) {
		prijsPerDag = prPd;
	}
	
	public String toString() {
		String a =  type + " met prijs per dag: " + prijsPerDag;
		return a;
	}
}
