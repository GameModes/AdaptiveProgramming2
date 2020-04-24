package domeindesign1;

public class Route {
	private int routenummer;
	private String weer;
	
	public Route(int rn, String w) {
		routenummer = rn;
		weer = w;
	}

	public double getRoutenummer() {
		return routenummer;
	}

	public void setRoutenummer(int routenummer) {
		this.routenummer = routenummer;
	}

	public String getWeer() {
		return weer;
	}

	public void setWeer(String weer) {
		this.weer = weer;
	}
	
	public String toString() {
		String route =  "Route " + routenummer + " (weer: " + weer + ")";
		return route;
	}
	
}
