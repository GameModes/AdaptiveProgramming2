package F1;
import java.util.ArrayList;

public class Player {
	private String naam;
	private double Budget;
	ArrayList<String> bezit = new ArrayList<String>();
			
public Player(String nm, double b) {
	naam = nm;
	Budget = b;
}
	
public String getNaam() {
	return naam;
}

public void setNaam(String naam) {
	this.naam = naam;
}

public double getBudget() {
	return Budget;
}

public void setBudget(double budget) {
	Budget = budget;
}



public boolean koop(Game g) {
	boolean buyable = true;
	if (bezit.size() != 0) {
	if (getBudget() < g.newWaarde(g.getWaarde())){
		buyable = false;
	}
	else if (bezit.contains(g.toString()) == true) {
		buyable = false;
	}
}
	if (buyable == true) {
		bezit.add(g.toString());
		Budget = Budget - g.newWaarde(g.getWaarde());
		}
	return buyable;
}
	

public String toString() {
	String k = naam + " heeft een budget van $" + Budget + " en bezit de volgende games: \n";
	for (int i = 0; i < bezit.size(); i++) {
	      k = k + bezit.get(i) + "\n";
	    }
	return k;
}
	
	
	
	
}
