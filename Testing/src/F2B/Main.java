package F2B;

import F2A.Node;

public class Main {
	public static void main(String[] args) {

		KansNode K0 = new KansNode("K0", false);
		KansNode K1 = new KansNode("K1", false);
		KansNode K2 = new KansNode("K2", false);
		KansNode K3 = new KansNode("K3", false);
		KansNode K4 = new KansNode("K4", false);
		KansNode K5 = new KansNode("K5", false);
		KansNode K6 = new KansNode("K6", false);
		
		KansNode D1 = new KansNode("1", true);
		KansNode D2 = new KansNode("2", true);
		KansNode D3 = new KansNode("3", true);
		KansNode D4 = new KansNode("4", true);
		KansNode D5 = new KansNode("5", true);
		KansNode D6 = new KansNode("6", true);
		
		
		K0.setVerbinding(1, K2);
		K0.setVerbinding(0, K2);
		
		K1.setVerbinding(1, K3);
		K1.setVerbinding(0, K4);
		
		K2.setVerbinding(1, K5);
		K2.setVerbinding(0, K6);
		
	}
}
