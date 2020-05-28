package dijkstrasPath3;

public class Rit extends Stap{
	public Integer snelheid;
	public Plaats nextnode;
	
	
	public Rit(Integer sh, Plaats nn) {
		snelheid = sh;
		nextnode = nn;
	}
}
