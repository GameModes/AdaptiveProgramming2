package F2B;

public class Main {		
	public static void main(String[] args) {
	KansNode n0 = new KansNode("n0", false);
	KansNode n1 = new KansNode("n1", false);
	KansNode n2 = new KansNode("n2", false);
	KansNode n3 = new KansNode("n3", false);
	KansNode n4 = new KansNode("n4", false);
	KansNode n5 = new KansNode("n5", false);
	KansNode n6 = new KansNode("n6", false);
				
	KansNode g1 = new KansNode("1", true);
	KansNode g2 = new KansNode("2", true);
	KansNode g3 = new KansNode("3", true);
	KansNode g4 = new KansNode("4", true);
	KansNode g5 = new KansNode("5", true);
	KansNode g6 = new KansNode("6", true);
	
	n0.setVerbinding(n1, 1/6);
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
	
	System.out.println(Dobbelsteen.bouwDobbelsteen(n0));		

	}
}
