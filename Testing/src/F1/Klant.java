package F1;

public class Klant {
	String naam;
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
		if (naam == null) {
			naam = "onbekende huurder";
		}
		String k = "op naam van: " + naam + "(korting: " + kortingsPercentage + "%)";
		return k;
	}
}
