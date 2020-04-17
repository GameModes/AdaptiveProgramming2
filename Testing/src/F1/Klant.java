package F1;

public class Klant {
	private String naam;
	double kortingsPercentage;
	
	public Klant(String nm) {
		naam = nm;

		
	}
	
	public double getKorting() {
		return kortingsPercentage;
	}
	
	public void setKorting(double kP) {
		kortingsPercentage = kP;
	}
	
	public String toString() {
		String k = "op naam van: " + naam + "(korting: " + kortingsPercentage + "%)";
		return k;
	}
}
