package F2A2;

public class Main {
	public static void main(String[] args) {
		Node S0 = new Node("S0");
		Node S1 = new Node("S1");
		Node S2 = new Node("S2");
		Node S3 = new Node("S3");
		
		S0.setNodeA(S2);
		S0.setNodeB(S1);
		
		S1.setNodeA(S1);
		S1.setNodeB(S2);
		
		S2.setNodeB(S3);
		
		S0.setNodeA(S3);
		S0.setNodeB(S0);
		
	}
}
