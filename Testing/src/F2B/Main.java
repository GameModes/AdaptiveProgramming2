package F2B;

public class Main {		
	public static void main(String[] args) {
	KansNode n0 = new KansNode("n0", false);
	KansNode n1 = new KansNode("n1", false);
	KansNode n2 = new KansNode("n2", false);
	KansNode n3 = new KansNode("n3", true);
	KansNode n4 = new KansNode("n4", true);
	KansNode n5 = new KansNode("n5", true);
	KansNode n6 = new KansNode("n6", true);
				
	n0.setVerbinding(n1, 1);
	n0.setVerbinding(n2, 0.5);
	
	n1.setVerbinding(n3, 0.4);
	n1.setVerbinding(n4, 1);
	
	n2.setVerbinding(n5, 0.3);
	n2.setVerbinding(n6, 1);
				
	System.out.println(Dobbelsteen.bouwDobbelsteen(n0));		
//		KansNode K1 = new KansNode("K1", false);
//		KansNode K2 = new KansNode("K2", false);
//		KansNode K3 = new KansNode("K3", false);
//		KansNode K4 = new KansNode("K4", false);
//		KansNode K5 = new KansNode("K5", false);
//		KansNode K6 = new KansNode("K6", false);
//		
//		KansNode D1 = new KansNode("1", true);
//		KansNode D2 = new KansNode("2", true);
//		KansNode D3 = new KansNode("3", true);
//		KansNode D4 = new KansNode("4", true);
//		KansNode D5 = new KansNode("5", true);
//		KansNode D6 = new KansNode("6", true);
		

		
//		try {
//			System.out.println(K0.Dobbelsteennummer("Dobbelsteenogen?"));
//		Finally
//		}
	}
}
