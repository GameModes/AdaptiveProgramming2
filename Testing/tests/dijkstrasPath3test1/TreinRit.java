package dijkstrasPath3test1;

public class TreinRit extends Stap{
	public Integer snelheid;
	public Plaats nextnode;
	
	
	public TreinRit(Integer sh, Plaats nn) {
		snelheid = sh;
		nextnode = nn;
	}
}
