package dijkstrasPath3;

public class Vlucht extends Stap{
	public Integer snelheid;
	public Plaats nextnode;
	
	
	public Vlucht(Integer sh, Plaats nn) {
		snelheid = sh;
		nextnode = nn;
	}
}
