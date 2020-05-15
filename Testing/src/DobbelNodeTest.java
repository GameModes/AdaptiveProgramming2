import static org.junit.Assert.*;

import org.junit.Test;

import finitestatemachine2.DobbelNode;
import finitestatemachine2.FSMPicker;

public class DobbelNodeTest {

	@Test
	public void test() {
		DobbelNode n0 = new DobbelNode("n0");
		DobbelNode n1 = new DobbelNode("n1");	
		DobbelNode n2 = new DobbelNode("n2");
		DobbelNode n3 = new DobbelNode("n3");
		DobbelNode n4 = new DobbelNode("n4");
		DobbelNode n5 = new DobbelNode("n5");
		DobbelNode n6 = new DobbelNode("n6");
					
		DobbelNode g1 = new DobbelNode("1");
		DobbelNode g2 = new DobbelNode("2");
		DobbelNode g3 = new DobbelNode("3");
		DobbelNode g4 = new DobbelNode("4");
		DobbelNode g5 = new DobbelNode("5");
		DobbelNode g6 = new DobbelNode("6");
		
		n0.setVerbinding(n1, 1/3);
		n0.setVerbinding(n2, 1);
		
		n1.setVerbinding(n4, 0.4);
		n1.setVerbinding(n3, 1);

		n2.setVerbinding(n5, 0.8);
		n2.setVerbinding(n6, 1);
		
		n3.setVerbinding(g1, 0.5);
		n3.setVerbinding(n1, 1);
		
		n4.setVerbinding(g2, 0.8);
		n4.setVerbinding(g3, 1);

		n5.setVerbinding(g4, 0.3);
		n5.setVerbinding(g5, 1);
		
		n6.setVerbinding(n2, 0.3);
		n6.setVerbinding(g6, 1);
		
		System.out.println(FSMPicker.gekozenMachine(n0));	
	}
}
