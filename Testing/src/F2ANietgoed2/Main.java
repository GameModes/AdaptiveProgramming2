package F2ANietgoed2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
						  //naam, als1, dan1, als2, dan2
		Nodes S0 = new Nodes("S0", "B", "S1", "A", "S2");
		
		System.out.println(S0.getNode());
		Nodes S1 = new Nodes("S1", "A", "S1", "B", "S2");
		Nodes S2 = new Nodes("S2", "B", "S3", "null", "null");
		Nodes S3 = new Nodes("S3", "A", "S3", "B", "S0");
		
		ArrayList<String> allNodes = new ArrayList<String>();
		allNodes.add(S0.getNode().toString());
		allNodes.add(S1.getNode().toString());
		allNodes.add(S2.getNode().toString());
		allNodes.add(S3.getNode().toString());
		
		System.out.println(allNodes);
		FSM input1 = new FSM("BAAB" , allNodes);
//		input1.setNode(S0.getNode());
//		input1.getFSM();
		
	}
}
