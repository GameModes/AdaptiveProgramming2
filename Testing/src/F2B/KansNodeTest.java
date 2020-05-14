package F2B;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class KansNodeTest {
	ArrayList<KansNode> path = new ArrayList<KansNode>();
	HashMap<Double, KansNode> locatiesprong = new HashMap<Double, KansNode>();
	private Random ran = new Random();
	private String nodeNaam;
	private boolean eindstate;

	public KansNodeTest(String nn, boolean es) {
		nodeNaam = nn;
		eindstate = es;
	}


	public void setVerbinding(double kansnummer, KansNode nummer) {
		locatiesprong.put(kansnummer, nummer);
		
	}
	

	
	public KansNode NextLocatie() {
		double locatienummer = 0;

		for (Double i:locatiesprong.keySet()) {
			locatienummer += 1;
		}
		if (locatienummer != 1.0) {
			return null;
		}
		else {
			for (KansNode j:locatiesprong.values()) {
				for (int y = 0; y < locatiesprong.get(j); y++) {
					path.add(j);
				}
			}
		}
	}

}	