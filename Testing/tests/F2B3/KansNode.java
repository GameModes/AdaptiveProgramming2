package F2B;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;

public class KansNode {
	private int tiental;
	private int eental;
	ArrayList<String> path = new ArrayList<String>();
	HashMap<Integer, KansNode> locatiesprong = new HashMap<Integer, KansNode>();


	public KansNode(int tt, int et) {
		eental = et;
		tiental = tt;
		
	}


	public void setVerbinding(int kansnummer, KansNode nummer) {
		locatiesprong.put(kansnummer, nummer);
		
	}
	
	
	public int Dobbelsteennummer(int dobbelzijdes) {
		1 = 0.9
		4 = 0.1
		int randomgetal = ThreadLocalRandom.current().nextInt(0, 10 + 1);
			randomgetal = randomgetal/10
					
			if random < kansvan4:
				return 4
			else if random > kansvan1:
				return 1
				

		path = locatiesprong.get(randomNum).Dobbelsteennummer(input);
		path.add(0, naam);

		}
	}
	
