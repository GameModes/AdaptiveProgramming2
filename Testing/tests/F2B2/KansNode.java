package F2B2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;

public class KansNode {
	private String naam;
	private boolean endstate;
	ArrayList<String> path = new ArrayList<String>();
	HashMap<Integer, KansNode> locatiesprong = new HashMap<Integer, KansNode>();


	public KansNode(String nm, boolean end) {
		naam = nm;
		endstate = end;
		
	}


	public void setVerbinding(int kansnummer, KansNode node) {
		locatiesprong.put(kansnummer, node);
		
	}
	
	
	public ArrayList<String> Dobbelsteennummer(ArrayList<String> input) {
		if(endstate != true) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
			path = locatiesprong.get(randomNum).Dobbelsteennummer(input);
			path.add(0, naam);
			return input;
		}
		else {
			return input;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}